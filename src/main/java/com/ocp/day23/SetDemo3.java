package com.ocp.day23;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo3 {

    public static void main(String[] args) {
        //泛型<>;型別限定
        Set<Integer> scores = new LinkedHashSet<>();
        scores.add(100);
        scores.add(90);
        scores.add(80);
        System.out.println(scores);
        int sum = 0;
        Iterator<Integer>iter = scores.iterator();
        while (iter.hasNext()) {
            Integer next = iter.next();
            sum+=next;
        }
        System.out.println("sum");
        //Java8
        sum = scores.stream().mapToInt(Integer::intValue).sum();//(s->s.intValue)
        System.out.println(sum);
    }
}
