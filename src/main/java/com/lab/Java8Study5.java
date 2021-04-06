package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Java8Study5 {

    public static void main(String[] args) {
        String[]score = {"80", "50", "70", "90", "40"};
        //算出總和 最高 最低 
        IntSummaryStatistics stat = Stream.of(score)
                                    .mapToInt(s -> Integer.parseInt(s))//得到IntStream
                                    .filter(s -> s >=60)//過濾及格分數
                                    .summaryStatistics();//統計
        System.out.printf("sum: %d,max: %d,min: %d\n",stat.getSum(),stat.getMax(),stat.getMin());
    }
}
