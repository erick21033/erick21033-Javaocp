package com.ocp.day12;

public class Zoo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.shout();
        Tiger tiger = new Tiger();
        tiger.shout();
        tiger.hunter();
        //cat.hunter(); 因為cat裡面沒有hunter
        Cat cat2 = new Tiger();
        cat2.shout();
    }
}
