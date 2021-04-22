package com.ocp.day16;

import java.util.Random;

public class LuckyNumberMain {
    public static void main(String[] args) {
        //利用 Lambda 實作一個可以得到1~9 的功能
      
        LuckyNumber num = ()-> new Random().nextInt(9)+1;
        System.out.println(num.get());
        
        //利用 Lambda 實作一個可以得到1~49 的功能
        LuckyNumber num2 = ()->{
            Random r = new Random();
            int n = r.nextInt(49)+1;
            return 5; 
        };
        System.out.println(num2.get());
    }
}
