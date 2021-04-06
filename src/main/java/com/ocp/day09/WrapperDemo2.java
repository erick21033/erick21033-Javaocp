/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day09;

/**
 *  
 * @author MB-study
 */
public class WrapperDemo2 {
    public static void main(String[] args) {
        Integer a = new Integer(100);
        Integer b = new Integer(200);
        System.out.println(a.intValue()+b.intValue());
        //5.0後的寫法
        Integer a2 = 100;//編譯器產生new nteger(100)*auto-boxing(自動裝箱
        Integer b2 = 200;
        System.out.println(a+b);
        int c = new Integer(100);
        System.out.println(c);
    }
}
