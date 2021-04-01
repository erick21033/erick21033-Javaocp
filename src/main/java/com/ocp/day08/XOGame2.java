package com.ocp.day08;
import java.util.*;
public class XOGame2 {

    public static void main(String[] args) {
        char[][] xo = new char[3][3];
        do{
            Scanner sc = new Scanner(System.in);
            print(xo);
            System.out.print("請選擇0~8===> ");
            int n = sc.nextInt();
            if(n==9)break;
            xo[n/3][n%3]='o';
        }while(true);
    }

    public static void print(char[][] xo) {
        for (char[] x : xo) {
            System.out.print("| ");
            for (char y : x) {
                System.out.print(y + " | ");
            }
            System.out.println("");
        }
    }
}
