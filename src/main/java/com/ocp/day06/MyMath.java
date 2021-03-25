package com.ocp.day06;

public class MyMath {
    //求總數
    public static double sum(double[] nums) {
        int sum = 0;
        for (double n : nums) {
            sum += n;
        }
        return sum;
    }
    //平均
    public static double avg(double[] nums){
        double sum = sum(nums);
        double n = nums.length;
        double avg = sum/n;
        return avg;
    }
    //標準差
    public static double sd(double[] nums){
        double avg = avg(nums);
        double sumOfSquares = 0;
        for(double n:nums){
          sumOfSquares += Math.pow(n-avg,2);
        }
        int n = nums.length;
        double sd = Math.sqrt((1.0/n)*sumOfSquares);
        return sd;
    }
    //變異係數
    public static double cv(double[]nums){
        double avg = avg(nums);
        double sd = sd(nums);
        double cv = sd/avg;
        return cv;
    }
}
