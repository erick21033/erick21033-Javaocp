
package com.ocp.day09;

public class WrapperDemo {
    public static void main(String[] args) {
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int max2 = Integer.max(10, 20);
        System.out.println(max2);
        String chinese = "100";
        String Englich = "90";
        System.out.println(Integer.parseInt(chinese)+Integer.parseInt(Englich));
        
    }
}
