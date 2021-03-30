
package com.lab;
import java.util.*;
public class ABGussNumber {
    public static void main(String[] args) {
        
        int[]ansArray = Util.getAnsArray();
        System.out.println(Arrays.toString(ansArray));
        do{
            System.out.print("請輸入一組不重複的四位數: ");
            Scanner sc = new Scanner(System.in);
            String guess = sc.next();
            int[]guessArray = {guess.charAt(0)-48,guess.charAt(1)-48,guess.charAt(2)-48,guess.charAt(3)-48};
            //判斷a,b
            int a = 0,b = 0;
            for(int i=0;i<4;i++){
                if(ansArray[i]==guessArray[i]){
                    a++;
                }
            }
            for(int i=0;i<4;i++){
                for(int k=0;k<4;k++){
                    if(ansArray[i]==guessArray[k]){
                        b++;
                        break;
                    }
                }
            }
            b-=a;
            
            System.out.printf("%d A %d B\n",a,b);
            if(a==4){
                System.out.println("Biogo");
                break;}
        }while(true);
    }
}
