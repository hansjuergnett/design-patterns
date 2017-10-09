package com.iluwatar.compositeEmployee;

public class LineManager extends Employee {

    private String department;

    public LineManager(String name, String department) {
        this.name = name;
        this.department = department;
    }

    @Override
    int getNUmberOfEmployees() {
        int numberOfEmpoyees = 1;
        for (Employee employee: children) {
            numberOfEmpoyees += employee.getNUmberOfEmployees();
        }
        return numberOfEmpoyees;
    }

    void print(String tab) {
        System.out.println(tab + getClass().getSimpleName() + " " + name  + " (" + getDepartment() +")");
        for (Employee employee: children) {
           employee.print(tab + "\t");
        }
    }

    public void add(Employee employee){
        this.children.add(employee);
    }

    public void remove(Employee employee){
        this.children.remove(employee);
    }

    public Employee getEmployee(int index){
        return  children.get(index);
    }

    public String getDepartment() {
        return department;
    }
}
