
package com.ocp.day14;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;


public class Test {
    public static void main(String[] args) {
        
    
    Employee e1 = new PG();
    e1.setSalary(5_0000);
    Employee e2 = new PG(7_0000);
    Employee e3 = new Art(2_8000);
    Employee e4 = new Art();
    e4.setSalary(6_0000);
    
    //印出每個人的工作
    Employee[]employees={e1,e2,e3,e4};
        Stream.of(employees).forEach(e->e.job());
    //求出總薪資與平均薪資
//    int sum = Stream.of(employees).mapToInt(Employee::getSalary).sum();
//        System.out.printf("總薪資: %d\n",sum);
//        double avg = Stream.of(employees).mapToInt(Employee::getSalary).average().getAsDouble();
//        System.out.printf("平均薪資: %.2f\n",avg);
        IntSummaryStatistics stat = Stream.of(employees).mapToInt(Employee::getSalary).summaryStatistics();
        System.out.println("總薪資: "+stat.getSum());
        System.out.println("平均薪資: "+stat.getAverage());
    
    }
}
