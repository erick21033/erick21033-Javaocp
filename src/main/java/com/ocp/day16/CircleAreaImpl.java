package com.ocp.day16;

public class CircleAreaImpl implements CircleArea{

    @Override
    public double getArea(double r) {
        return r*r*Math.PI;
    }
    
}
