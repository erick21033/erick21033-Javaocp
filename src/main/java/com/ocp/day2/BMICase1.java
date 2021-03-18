package com.ocp.day2;
import java.util.*;
class bmi{
    String name;
    double height,weight;
    Scanner sc = new Scanner(System.in);
    public bmi(String name,double h,double w) {
        this.name = name;
        this.height = h;
        this.weight = w; 
    }

    public double getbmi(){
        double bmi = weight / Math.pow(height/100, 2);
        return bmi;
    }
    String getResultValue(){
        double bmiValue = getbmi();
        String resuleValue = (bmiValue>23)?"過重":(bmiValue<18)?"過輕":"正常";
        return resuleValue;
    }
    void print(){
        double bmiValue = getbmi();
        String resuleValue = (bmiValue>23)?"過重":(bmiValue<18)?"過輕":"正常";
        System.out.printf("姓名:%s 身高:%.1f 體重:%.1f bmi:%.2f 結果:%s\n",
                name,height,weight,getbmi(),getResultValue());
    }
}

public class BMICase1 {

    public static void main(String[] args) {
        
        bmi h1 = new bmi("Ming",170,60);
        h1.print();
        bmi h2 = new bmi("Ting",150,60);
        h2.print();
        
       
    } 
}
