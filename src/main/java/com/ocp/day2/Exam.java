
package com.ocp.day2;
class Score{
    String name;
    int Ch,Ma;

    public Score(String nm,int c,int m) {
        name = nm;
        Ch = c;
        Ma = m;
    }
    
    
public int getSum(){
    
    return Ch+Ma;
}
public double getAvg(){
    return getSum()/2.0;
}
public String toString(){
    return "姓名: "+name+"國文: "+Ch+"數學: "+Ma+"總分: "+getSum()+"平均: "+getAvg();
}
public String getPrintDate(){
    return String.format("姓名:%s 國文:%d 數學:%d 總分:%d 平均:%0.1f\n",name,Ch,Ma,getSum(),getAvg());
}    

}    


public class Exam {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Score s1 = new Score("小名",60,60);
      //  System.out.println(s1.toString());
        System.out.printf(s1.getPrintDate());
    }
    
}
