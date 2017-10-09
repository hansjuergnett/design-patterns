package com.iluwatar.decorator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArchTroll extends TrollDecorator {

    private static final Logger LOGGER = LoggerFactory.getLogger(ArchTroll.class);

    public ArchTroll(Troll decorated) {
        super(decorated);
    }

    @Override
    public void attack() {
        super.attack();
        LOGGER.info("The troll shoots  with a arch on you!");
    }

    @Override
    public int getAttackPower() {
        return super.getAttackPower() + 15;

    }

}
