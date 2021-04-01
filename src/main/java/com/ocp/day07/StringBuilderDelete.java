
package com.ocp.day07;

public class StringBuilderDelete {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java cource");
        System.out.println("sb="+sb);
        sb.delete(0, 5);//(0,11)從0開始到小於11的資料全部刪除
        System.out.println("sb="+sb);
        int[][]m = new int[2][3];
        System.out.println(m[0].length);
    }
}
