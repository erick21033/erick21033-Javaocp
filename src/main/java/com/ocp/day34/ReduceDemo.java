package com.ocp.day34;

import java.util.Arrays;
import java.util.stream.LongStream;

public class ReduceDemo {
    public static void main(String[] args) {
        long[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(numbers));
        long result = LongStream.of(numbers)
                .reduce(0, (total,n)->total + n);
        System.out.println(result);
    }
}
