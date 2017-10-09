package com.iluwatar.compositeEmployee;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {

    protected String name;
    protected List<Employee>children = new ArrayList<>();

    abstract int getNUmberOfEmployees();

    abstract void print(String tab);

}
