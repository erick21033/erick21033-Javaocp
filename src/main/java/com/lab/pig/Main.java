package com.lab.pig;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args)throws Exception{
       Stream.of(Util.getPigs())
                .filter(r -> r.getAddr().contains("桃園"))
                .forEach(System.out::println);
    }
}
