
package com.ocp.day08;

public class MultiArrayDemo4 {
    public static void main(String[] args) {
        double[][]hw = {{170,160,180},{60,45,90}};
        
    for (int i = 0; i < 1; i++) {
			for (int k = 0; k < hw[1].length; k++) {
				double bmi = hw[i + 1][k] / Math.pow(hw[i][k] / 100, 2);
				System.out.printf("bmi: %.2f\n", bmi);
			}
		}
        
    }
}
