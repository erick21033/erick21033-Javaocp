package com.ocp.day06;
import java.util.*;
/**
 * 調查五位學生之身高及體重如下，試比較其分散程度。 身高(h)：172、168、164、170、176(公分)
 * 體重(w)：62、57、58、64、64(公斤)
 *
 */
public class ArrayBMICv {

    public static void main(String[] args) {
        String[] names = {"A", "B", "C", "D", "E"};
        double[] h = {172, 168, 164, 170, 176};
        double[] w = {62, 57, 58, 64, 64};
        //建立一個Person陣列persons
        Person[] persons = new Person[5];
        for(int i=0;i<persons.length;i++){
            //建立一個person 物件p
        Person p = new Person(names[i], h[i], w[i]);
        //將Person物件p放入persons[0]
        persons[i] = p;
        
        }
       //印出BMI
        for(Person p:persons){
            System.out.printf("bmi: %.1f\n",p.bmi);
        }
        //建立一個double[]bmis 存放bmis的資料
        double[] bmis = new double[5];
        for(int i=0;i<persons.length;i++){
            bmis[i] = persons[i].bmi;
        }
        System.out.println(Arrays.toString(bmis));
        double bmi_cv = MyMath.cv(bmis);
        System.out.printf("BMI C.V: %.2f%%",bmi_cv*100);
    }
}
