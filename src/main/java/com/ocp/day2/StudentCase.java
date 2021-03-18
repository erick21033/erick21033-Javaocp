
package com.ocp.day2;

//import java.io.*;

public class StudentCase {

   
    public static void main(String[] args)/*throws IOException*/ {
        Student s1 = new Student("明",20,170,60);
        s1.print();
        s1.ex = new Exam(s1.name,100,90);
        s1.print();
        System.out.println(s1.bmi.getbmi());
        System.out.println(s1.ex.getAvg());
            s1.ex.Ma = 75;
            s1.print();
    }
    
}
