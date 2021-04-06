
package com.lab;

import java.util.stream.IntStream;


public class Java8Study3 {
    public static void main(String[] args) {
        int[] score = {80,50,70,90,40};
        //算出總分平均
        //java7
        int sum = 0;
        double avg = 0;
        for(int s:score){
            sum+=s;
        }
        avg = sum/5;
        System.out.printf("總分: %d 平均: %.1f",sum,avg);
        
        //java8
        int sum2 = IntStream.of(score).sum();
        double avg2 = IntStream.of(score).average().getAsDouble();
       
    }
}
