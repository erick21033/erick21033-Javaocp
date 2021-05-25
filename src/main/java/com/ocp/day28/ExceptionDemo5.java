package com.ocp.day28;

public class ExceptionDemo5 {
    public static void main(String[] args) {
         int[]x = {0};
         try {
            int avg = 10/x[0];
            System.out.println(avg);
        } catch (Exception e) {
            e.printStackTrace(System.out);//印出詳細錯誤訊息 
            return;
        }
         finally{
             System.out.println("程式結束: 這是一定要執行的");
         }
         
    }
    
}
