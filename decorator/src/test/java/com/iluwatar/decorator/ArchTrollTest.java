package com.iluwatar.decorator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.internal.verification.VerificationModeFactory.times;

public class ArchTrollTest {

    @Test
    public void testSmartHostile() throws Exception {
        // Create a normal troll first, but make sure we can spy on it later on.
        final Troll simpleTroll = spy(new SimpleTroll());
        final Troll clubbed = spy(new ClubbedTroll(simpleTroll));

        // Now we want to decorate the troll to make it stronger ...
        final Troll clubbedArcherTroll = new ArchTroll(clubbed);
        assertEquals(35, clubbedArcherTroll.getAttackPower());
        verify(simpleTroll, times(1)).getAttackPower();

        // Check if the clubbed troll actions are delegated to the decorated troll
        clubbedArcherTroll.attack();
        verify(simpleTroll, times(1)).attack();

        clubbedArcherTroll.fleeBattle();
        verify(simpleTroll, times(1)).fleeBattle();
        verifyNoMoreInteractions(simpleTroll);
    }
}
