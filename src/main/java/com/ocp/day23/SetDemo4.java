package com.ocp.day23;

import java.util.IntSummaryStatistics;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetDemo4 {
    public static void main(String[] args) {
         //國英數的分數是介於0~100之間
        Set<Integer> scores = new LinkedHashSet<>();
        scores.add(100);
        scores.add(200);
        scores.add(90);
        scores.add(-150);
        scores.add(80);
        System.out.println(scores);
        //Java8求總分
        IntSummaryStatistics stat = scores.stream()
                .filter(Score::isValid)
                .mapToInt(Integer::intValue)
                .summaryStatistics();
        System.out.println(stat.getSum());
    }
}
