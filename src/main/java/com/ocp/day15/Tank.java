
package com.ocp.day15;

public class Tank extends Car implements Weapon{

    @Override
    void move() {
        System.out.println("履帶");
    }

    @Override
    public void shoot() {
        System.out.println("穿甲彈");
    }
    
}
