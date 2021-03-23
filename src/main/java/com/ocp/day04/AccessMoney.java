
package com.ocp.day04;

import com.ocp.day04.bar.money;

public class AccessMoney {

    public static void main(String[] args) {
       money m1 = new money();
        System.out.println(m1.amount);
        com.ocp.day04.foo.money m2 = new com.ocp.day04.foo.money();
        System.out.println(m2.amount);
        
        System.out.println(m1.amount+m2.amount);
    }
    
}
