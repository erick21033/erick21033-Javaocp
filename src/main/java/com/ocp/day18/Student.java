package com.ocp.day18;

public class Student extends Person{
    private int score;
    private Teacher teacher;

    public Student() {
    }

    public Student(String name, int age,int score, Teacher teacher ) {
        super(name, age);
        this.score = score;
        this.teacher = teacher;
    }
    
   
    
}
