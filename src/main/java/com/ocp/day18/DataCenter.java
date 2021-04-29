package com.ocp.day18;

public class DataCenter {
    public static Person[]getPeople() {
        
        Teacher t1 = new Teacher("mary",29,75_000);
        Teacher t2 = new Teacher("John",28,55_000);
        Teacher t3 = new Teacher("Helen",32,120_000);
        Student s1 = new Student("小明",t3,17,90);
        Student s2 = new Student("小華",t3,18,80);
        Student s3 = new Student("小英",t2,16,70);
        Student s4 = new Student("小美",t1,18,60);
        Student s5 = new Student("小鐘",t1,16,50);
        Student s6 = new Student("小彤",t2,16,40);
        Student s7 = new Student("小雪",t1,17,30);
        Person[]people = {t1,t2,t3,s1,s2,s3,s4,s5,s6,s7};
        return people;
    }
}
