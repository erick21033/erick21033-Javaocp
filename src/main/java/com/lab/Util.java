package com.lab;

import java.util.Random;

public class Util {
//取得答案陣列
    public static int[] getAnsArray() {
        Random r = new Random();
        int[] ans = new int[4];//{0,0,0,0}
        for (int i = 0; i < ans.length;) {
            int n = r.nextInt(9) + 1;//1~9
            boolean exist = isExist(ans, n);
            if(!exist){
                ans[i] = n;
                i++;
            }
        }
        return ans;
    }
//判斷n值是否在ans[]int陣列裡面
    private static boolean isExist(int[] ans, int n) {
        for(int i=0;i<ans.length;i++){
            if(ans[i]==n){
                return true;
            }
        }
        return false;
    }
}
