package com.ocp.day27;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map map1 = new Hashtable();//LinkedHashMap();//TreeMap();//HashMap();
        map1.put(1,100);
        map1.put(2,80);
        map1.put(4,80);
        map1.put(3,80);
        map1.put(5,90);
        System.out.println(map1);
    }
}
