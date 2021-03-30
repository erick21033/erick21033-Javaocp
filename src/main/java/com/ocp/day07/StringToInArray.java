
package com.ocp.day07;

public class StringToInArray {
    public static void main(String[] args) {
        String s = "1234";
        System.out.println(s.charAt(0));
        int[]nums = {s.charAt(0)-48,s.charAt(1)-48,s.charAt(2)-48,s.charAt(3)-48};
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
    }
}
