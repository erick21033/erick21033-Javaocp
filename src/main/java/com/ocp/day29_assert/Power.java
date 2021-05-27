package com.ocp.day29_assert;

//電力換算
//W(瓦數),V(電壓),A(電流)
//W = V * A
public class Power {
    //取得W 方法getW(int v,int a)
    public int getW(int v,int a){
        int W = v*a;
        return W;
    }
    //取得A 方法getA(int w,int v)
    public int getA(int w,int v){
        int A = w*v;
        return A;
    }
    //取得V 方法getV(int w,int a)
    public int getV(int w,int a){
        int V = w*a;
        return V;
    }
}
