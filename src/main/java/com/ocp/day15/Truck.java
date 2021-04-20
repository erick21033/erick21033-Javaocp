
package com.ocp.day15;


public class Truck extends Car implements Oil{

    @Override
    void move() {
        System.out.println("輪胎");
    }

    @Override
    public int spend() {
       return 100;
    }
    
}
