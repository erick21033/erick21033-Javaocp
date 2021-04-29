package com.ocp.day17;

import java.util.function.Function;

public class FunctionDemo {
    public static void main(String[] args) {
        //利用Function 來實作圓面積
        //半徑R 是整數 面積area是福點數
        Function<Integer,Double>f1 = (r) ->Math.pow(r, 2)*Math.PI;
        System.out.println(f1.apply(10));
    }
}
