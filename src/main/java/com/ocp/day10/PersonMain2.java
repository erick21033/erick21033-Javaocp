package com.ocp.day10;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PersonMain2 {

    public static void main(String[] args) {
        Person[] persons = {
            new Person("John", 17, 170, 60.5),
            new Person("Mary", 18, 160, 50.5),
            new Person("Jo", 19, 155, 42.5),
            new Person("Helen", 16, 185, 75.5),
            new Person("Tom", 21, 190, 120.5),
        };//建立BMI資料計算邏輯 使用Function<T,R>
        //T代表傳入參數型別 在這邊指的就是Person物件也就是p
        //R代表回傳資料型別 在這裡指的就是Double 也就是bmi的計算結果
        Function<Person,Double> getBMI = p ->p.getWeight() / Math.pow(p.getHeight() / 100, 2);
        //正常BMI的過濾器Predicate<Person>
        //getBMI.apply(p)取得getBmi的計算結果
        Predicate<Person>normalBmi = p->getBMI.apply(p)>18&&getBMI.apply(p)<=23;
        //印出正常人名
        Consumer<Person>printname = p->System.out.println(p.getName());
        Stream.of(persons).filter(normalBmi).forEach(printname);
        //
    }
}
