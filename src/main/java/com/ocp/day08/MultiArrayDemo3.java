
package com.ocp.day08;

public class MultiArrayDemo3 {
    public static void main(String[] args) {
        double[][]hw = {{170,60},{160,45},{180,90}};
        double bmi = 0;
//        for(int i=0;i<hw.length;i++){
//            for(int k=0;i<hw[1].length;i++){
//                bmi = hw[i][k]/Math.pow(hw[i+1][k+1], 2);
//            }
//        }
    for(double[]x:hw){
       
            bmi = x[1]/Math.pow(x[0]/100, 2);
            System.out.printf("bmi:%.2f\n",bmi);
        
}   
    }
}
