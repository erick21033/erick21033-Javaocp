
package com.ocp.day2;

public class Exam {
     String name;
    int Ch, Ma;

    public Exam(String nm, int c, int m) {
        this.name = nm;
        this.Ch = c;
        this.Ma = m;
    }
    public int getSum(){
        return Ch+Ma;
    }

    public double getAvg() {
        return getSum() / 2.0;
    }

//    public String toString() {
//        return "姓名: " + name + "國文: " + Ch + "數學: " + Ma + "總分: " + getSum() + "平均: " + getAvg();
//    }

    public String getPrintDate() {
        return String.format("姓名:%s 國文:%d 數學:%d 總分:%d 平均:%.1f\n", name, Ch, Ma, getSum(), getAvg());
    }
}
