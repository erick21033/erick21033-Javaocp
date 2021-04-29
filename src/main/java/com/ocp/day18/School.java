package com.ocp.day18;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class School {

    public static void main(String[] args) {
//        Arrays.stream(DataCenter.getPeople())
//                //.peek(e->System.out.println(e.getClass().getTypeName()))
//                .forEach(System.out::println);
        //考試平均的總分平均 = ?

        IntSummaryStatistics stat1 = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Student)
                .map(x -> (Student) (x))
                .mapToInt(Student::getScore)
                .summaryStatistics();

        System.out.println(stat1.getSum());
        System.out.println(stat1.getAverage());

        IntSummaryStatistics stat2 = Arrays.stream(DataCenter.getPeople())
                .filter(x -> x instanceof Teacher)
                .map(x -> (Teacher) (x))
                .mapToInt(Teacher::getSalary)
                .summaryStatistics();
        System.out.println(stat2.getSum());
        System.out.printf("%.2f",stat2.getAverage());

        
        //印出不及格的學生 老師
       Predicate<Student>notPass=x->x.getScore()<60;
       
        Consumer<Student>p = x ->System.out.printf("學生:%s, 分數:%d, 老師:%s\n",x.getName(),x.getScore(),x.getTeacher().getName());
        double avg = Arrays.stream(DataCenter.getPeople())
                .filter(x->x instanceof Student)
                .map(x->(Student)(x))
                .peek(p)
                .filter(notPass)
                .mapToInt(Student::getScore)
                .average().getAsDouble();
                
        System.out.println("不及格平均: "+avg);
        
    }
}
