
package com.ocp.day08;


public class MultiArrayDemo2 {
    public static void main(String[] args) {
        int sum = 0;
        int[][]m = {{100,90,80},{70,60,50}};
        System.out.println(m);
        System.out.println(m[0]);
        System.out.println(m[1]);
        //總分
        for(int[]x:m){
              for(int y:x){
                  sum+=y;
              }
          }
        System.out.println(sum);
        
        int[][]n={{1},{}};
        System.out.println(n.length);
    }
 
}
