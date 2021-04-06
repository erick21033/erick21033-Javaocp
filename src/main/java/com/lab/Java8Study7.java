
package com.lab;

import java.util.stream.Stream;


public class Java8Study7 {
    public static void main(String[] args) {
        String[][]name = {{"Jo","Mary"},{"John","Helen"},{"Bob"}};
        
        int sum = Stream.of(name)
                .flatMap(s -> Stream.of(s))//String[]轉Stream
                .mapToInt(s ->s.length())
                .sum();
        
        
        
       
                
    }
}
