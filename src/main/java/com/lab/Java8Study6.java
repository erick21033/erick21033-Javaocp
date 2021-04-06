
package com.lab;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;


public class Java8Study6 {
    public static void main(String[] args) {
        String[]name = {"banana","watermelon","apple","orange","mango"};
        //請求出所有字母總和
        
        int sum = Stream.of(name)
                .mapToInt(String::length)//.mapToInt(s ->s.length())
                .filter(s ->s%2==0)
                .sum();
        System.out.println(sum);
                
    }
}
