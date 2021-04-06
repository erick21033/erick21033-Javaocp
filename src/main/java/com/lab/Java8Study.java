package com.lab;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Java8Study {
    public static void main(String[] args) {
        int[] score = {80,50,70,90,40};
        
        for (int i = 0; i < score.length; i++) {
            System.out.println(score[i]);
        }
        for (int s : score) {
            System.out.println(s);
        }
        //java8(利用Stream.of()來進行資料分析
        IntStream.of(score).forEach(s ->System.out.println(s));
        IntStream.of(score).forEach(System.out::println);
    }
}
