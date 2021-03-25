
package com.ocp.day06;

public class ArrayCv {
    public static void main(String[] args) {
        double[]nums = {10,20,30};
        double sum = 0;
        for(double n:nums){//for-each
            sum+=n;
        }
        System.out.printf("sum: %.1f\n",sum);
        double avg = sum/nums.length;
        System.out.printf("avg: %.1f\n",avg);
        //求標準差SD
        double sumOfSquares = 0;
        for(double n:nums){
          sumOfSquares += Math.pow(n-avg,2);
        }
        System.out.printf("sumOfSquares: %.1f\n",sumOfSquares);
        double sd = Math.sqrt((1.0/nums.length)*sumOfSquares);
        System.out.printf("S.D: %.1f\n",sd);
        double cv = sd/avg;
        System.out.printf("C.V: %.1f\n",cv);
        
    }
}
