package com.ocp.day29_assert;

public class AssertDemo {
    public static void main(String[] args) {
        int c = 40;
        assert (c>=0&&c<=100):"分數錯誤"+c;
        System.out.println(c>=60?"Pass":"Fail");
    }
}
