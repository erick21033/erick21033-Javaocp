
package com.ocp.day07;

/**
 *
 * @author MB-study
 */
public class StringEqals3 {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Java";
        System.out.println(s1==s2);
        s1 = s1.concat("8");
        s2 = s2.concat("8");
        
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1==s2);
        System.out.println(s1.intern()==s2.intern());
                
    }
}
