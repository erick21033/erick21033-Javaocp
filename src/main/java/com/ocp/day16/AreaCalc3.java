package com.ocp.day16;

public class AreaCalc3 {
    public static void main(String[] args) {
        // 利用lambda算出面積
        Triangle t = (int h,int w)-> w*h *1/2.0;
        System.out.println(t.getArea(10, 5));
    }
}
