package com.ocp.day17;

import java.util.stream.Stream;

public class LambdaDemo {
    public static void main(String[] args) {
        Stream.of(100,50,70,80,30)
                .peek(x->System.out.println(x.getClass().getTypeName()))//Consumer
                .forEach(System.out::println);//Consumer
        
        Stream.of(100,50,70,80,30)
                .filter(x-> x>=60 )//Predicate
                .forEach(System.out::println);//Consumer
        
        Stream.of("Mary","John","Bob","Helen")
                .mapToInt(String::length)//Function (x->x.length())
                .forEach(System.out::println);//Consumer (x->System.out.println(x))
        
    }
}
