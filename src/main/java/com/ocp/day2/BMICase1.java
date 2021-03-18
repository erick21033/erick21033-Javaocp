package com.ocp.day2;

import java.util.*;
import java.io.*;

class bmi {

    String name;
    double height, weight;
    Scanner sc = new Scanner(System.in);
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public bmi() {

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

    void print() throws IOException {
        System.out.print("請輸入名字:");
        this.name = br.readLine();

        if (!this.name.matches("0-9")) {
            System.out.println("姓名輸入錯誤，請再輸入一次");
            return;
        }else{
            
        }

        System.out.print("請輸入身高:");
        this.height = sc.nextDouble();
        System.out.print("請輸入體重:");
        this.weight = sc.nextDouble();
        double bmiValue = getbmi();
        String resuleValue = (bmiValue > 23) ? "過重" : (bmiValue < 18) ? "過輕" : "正常";
        System.out.printf("姓名:%s 身高:%.1f 體重:%.1f bmi:%.2f 結果:%s\n",
                name, height, weight, getbmi(), getResultValue());

    }
}

public class BMICase1 {

    public static void main(String[] args) throws IOException {

        bmi h1 = new bmi();
        h1.print();
        bmi h2 = new bmi();
        h2.print();

    }
}
