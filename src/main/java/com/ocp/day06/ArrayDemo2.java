package com.ocp.day06;

import java.util.*;

public class ArrayDemo2 {

    public static void main(String[] args) {
        int[] socores = {50, 90, 90, 80, 70, 50, 40, 100, 75, 15};
        System.out.printf("%s,長度: %d\n", Arrays.toString(socores), socores.length);

        int sum = 0;
        for (int i = 0; i < socores.length; i++) {
            sum += socores[i];
        }

        double avg = (double) sum / socores.length;
        System.out.printf("總分: %d 平均: %.1f\n", sum, avg);
        System.out.println(sum);
        int max = 0;
        for (int i = 0; i < socores.length; i++) {
            
            if (socores[i] > max) {
                max = socores[i];
            }
        }
        System.out.println("最高分"+max);
        int min = 0;
        for (int i = 0; i < socores.length; i++) {
            min = socores[i];
            if (socores[i] > min) {
                min = socores[i];
            }
        }
        System.out.println("最低分"+min);
    }
}
