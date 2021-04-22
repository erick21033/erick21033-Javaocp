package com.ocp.day16;

public class AreaCalc {
    public static void main(String[] args) {
        double r = 15.0;
//        CircleArea ca = new CircleAreaImpl();
//        System.out.println(ca.getArea(r));
        
        //匿名內部類別(求圓面積
        CircleArea ca2 = new CircleArea() {
            @Override
            public double getArea(double r) {
                return r * r * Math.PI;
            }
        };  //{}←大括號是實作符號

        CircleArea ca3 = new CircleArea(){
            @Override
            public double getArea(double r){
                return Math.pow(r,3)*Math.PI/3*4;
            }
        };
     
              
                
        System.out.println(ca2.getArea(r));
        System.out.printf("%.6f\n",ca3.getArea(r));
    }
}
