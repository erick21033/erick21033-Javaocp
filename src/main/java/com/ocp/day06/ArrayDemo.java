package com.ocp.day06;
import java.util.*;
public class ArrayDemo {

    public static void main(String[] args) {
        int[]score = new int[]{100,90,90};
        int lens = score.length;
        System.out.printf("陣列長度: %d\n",lens);
        System.out.println(Arrays.toString(score));
        //總分
        int sum = score[0]+score[1]+score[2];
        double avg = (double)sum/lens;
        System.out.printf("總分: %d 平均: %.1f\n",sum,avg);
                
    }
}