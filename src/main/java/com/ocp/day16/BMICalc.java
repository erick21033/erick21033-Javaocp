package com.ocp.day16;


public class BMICalc {
    public static void main(String[] args) {
           //利用lambda實作BMI介面
           //h = 170,w = 60
           BMI bmi = (h,w)->w/(Math.pow(h/100, 2));
           System.out.printf("BMI: %.2f\n",bmi.getResult(170, 60));
    }
}
