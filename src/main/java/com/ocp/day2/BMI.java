
package com.ocp.day2;
//import java.io.*;
//import java.util.Scanner;

public class BMI {

    String name;
    double height, weight;
//    Scanner sc = new Scanner(System.in);
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public BMI(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    public double getbmi() {
        double bmi = weight / Math.pow(height / 100, 2);
        return bmi;
    }

    String getResultValue() {
        double bmiValue = getbmi();
        String resuleValue = (bmiValue > 23) ? "過重" : (bmiValue < 18) ? "過輕" : "正常";
        return resuleValue;

    }

    public void BMIprint() /*throws IOException*/ {
//        System.out.print("請輸入名字:");
//        this.name = br.readLine();
//        System.out.print("請輸入身高:");
//        this.height = sc.nextDouble();
//        System.out.print("請輸入體重:");
//        this.weight = sc.nextDouble();
        double bmiValue = getbmi();
        String resuleValue = (bmiValue > 23) ? "過重" : (bmiValue < 18) ? "過輕" : "正常";
        System.out.printf("姓名:%s 身高:%.1f 體重:%.1f bmi:%.2f 結果:%s\n",
                name, height, weight, getbmi(), getResultValue());

    }
}
