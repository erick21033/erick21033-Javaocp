package com.ocp.day28;


import java.util.Scanner;

public class ExceptionDemo1 {

    public static void main(String[] args) {
        play();
    }

    public static void play() {
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入半徑: ");
        try {
            double r = sc.nextInt();
            double area = Math.pow(r, 2) * Math.PI;
            System.out.printf("Area: %.2f", area);
        } catch (Exception e) {
            System.out.println("錯誤被抓到了 :" + e);
            System.out.println("半徑請輸入數字");
        }

    }
}
