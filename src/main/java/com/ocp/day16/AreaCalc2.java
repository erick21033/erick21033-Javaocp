package com.ocp.day16;

public class AreaCalc2 {
    public static void main(String[] args) {
        //利用匿名內部類別實作
        CircleArea ca = new CircleArea(){
          @Override
          public double getArea(double r){
              return Math.pow(r, 2)*Math.PI;
          }
        };
        //利用Lambda語法來實作
        CircleArea ca2 = (double r)->Math.pow(r, 2)*Math.PI;
        CircleArea ca3 = (r)->Math.pow(r,3)*Math.PI/3*4;
        System.out.println(ca2.getArea(15));
        System.out.println(ca3.getArea(15));
    }
}
