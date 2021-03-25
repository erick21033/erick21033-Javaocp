
package com.ocp.day06;

/*
.調查五位學生之身高及體重如下，試比較其分散程度。
            身高(h)：172、168、164、170、176(公分)
            體重(w)：62、57、58、64、64(公斤)
請問身高及體重哪一個比較集中
*/

public class ArrayCv3 {
    public static void main(String[] args) {
        double[]h = {172,168,164,170,176};
        System.out.println(MyMath.sum(h));
        System.out.println(MyMath.avg(h));
        System.out.println(MyMath.sd(h));
        System.out.println(MyMath.cv(h));
        double[]w = {62,57,58,64,64};
        System.out.println(MyMath.sum(w));
        System.out.println(MyMath.avg(w));
        System.out.println(MyMath.sd(w));
        System.out.println(MyMath.cv(w));
        
        String result= (MyMath.sd(h))>(MyMath.sd(w))?"身高較分散":"體重較分散";
        System.out.println("結果: "+result);
    }
}
