package com.ocp.day06;

/*
某公司有18位員工，
其中10位在去年投資股票，一年的獲利率如下(單位：%)：
7.6,3.9,15.6,28.3,1.2,10.8,35.3,45.6,10.2,0.5
另外8位員工投資買公債一年內獲利率如下(單位：%)
6.8,7.2,6.8,7.5,6.9,7.9,7.9,7.1,7.2
試分別求此公司的員工投資股票與公債的獲利率變異係數
以及哪一種投資的獲利較穩健 ?

 */
public class ArrayCv4 {

    public static void main(String[] args) {
        double[] stock = {7.6, 3.9, 15.6, 28.3, 1.2, 10.8, 35.3, 45.6, 10.2, 0.5};
        double sd_stock = MyMath.sd(stock);
        double cv_stock = MyMath.cv(stock);
        double[] bound = {6.8, 7.2, 6.8, 7.5, 6.9, 7.9, 7.9, 7.1, 7.2};
        double sd_bound = MyMath.sd(bound);
        double cv_bound = MyMath.cv(bound);
//        String result = (cv_stock > cv_bound) ? "股票穩健" : "債券穩健";
//        System.out.printf("股票係數: %.2f, 債券係數: %.2f, 結果: %s",cv_stock,cv_bound,result);
        
        System.out.println(MyMath.max(stock));
        System.out.println(MyMath.min(stock));
        System.out.printf("最大獲利: %.1f , 最小獲利: %.1f \n",MyMath.max(stock),MyMath.min(stock));
    }
}
