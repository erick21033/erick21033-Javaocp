package com.ocp.day02;

import java.io.IOException;

public class Student {
String name;
int age;
BMI bmi;
Exam ex;
    public Student(String nm,int age,double height,double weight) {
        this.name = nm;
        this.age = age;
        this.bmi = new BMI(name, height, weight);
    }
    void print()/*throws IOException*/{
        System.out.printf("姓名:%s 年齡%d\n",name,age);
        bmi.BMIprint();
        if(ex==null){
            System.out.println("此學生無成績");
        }else{
            System.out.println(ex.getPrintDate());
        }
    }
}
