package com.iluwatar.compositeEmployee;

public class AtomicEmployee extends  Employee {

    public AtomicEmployee(String name) {
        this.name = name;
    }

    @Override
    int getNUmberOfEmployees() {
        return 1;
    }

    @Override
    void print(String tab) {
        System.out.println(tab + name);
    }
}
