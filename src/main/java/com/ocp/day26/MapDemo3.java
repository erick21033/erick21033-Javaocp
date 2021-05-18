package com.ocp.day26;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo3 {
    public static void main(String[] args) {
        Map<Integer,String>students = new TreeMap<>();
        students.put(3, "Mary");
        students.put(1, "John");
        students.put(2, "Helen");
        System.out.println(students);
    }
}
