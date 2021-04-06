
package com.lab;

import java.util.stream.IntStream;


public class Java8Study2 {
    public static void main(String[] args) {
         int[] score = {80,50,70,90,40};
         for (int s:score) {
            if(s>60){//過濾 filter
                System.out.println("及格"+s);
            }
        }
         //java8
         IntStream.of(score)
                 .filter(s -> s>=60)
                 .forEach(s ->System.out.println(s));
    }
}
