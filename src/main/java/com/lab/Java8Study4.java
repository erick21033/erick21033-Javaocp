package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.IntStream;

public class Java8Study4 {
    public static void main(String[] args) {
        
    
    int[] score = {80, 50, 70, 90, 40};
    //sum,avg,max,min 各是多少?
    int sum = IntStream.of(score).sum();
    double avg = IntStream.of(score).average().getAsDouble();
    int max = IntStream.of(score).max().getAsInt();
    int min = IntStream.of(score).min().getAsInt();
     System.out.printf("sum: %d,avg:%.1f,max: %d,min: %d\n",sum,avg,max,min);
    //java8 part2
    IntSummaryStatistics stat = IntStream.of(score).summaryStatistics();
        System.out.printf("sum: %d,avg:%.1f,max: %d,min: %d\n",
                stat.getSum(),stat.getAverage(),stat.getMax(),stat.getMin());
    }
}
