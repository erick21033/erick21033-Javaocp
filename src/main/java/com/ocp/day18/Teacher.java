package com.ocp.day18;

public class Teacher extends Person{
    private int salary;

    public Teacher() {
    }

    public Teacher(String name, int age,int salary) {
        super(name, age);
        this.salary = salary;
    }
    
}
