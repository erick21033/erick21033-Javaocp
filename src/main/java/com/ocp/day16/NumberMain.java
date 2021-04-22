package com.ocp.day16;

public class NumberMain {
    public static void main(String[] args) {
        int i;
          PrimeNumber p = (n)-> {for(int i=2;i<=n;i++){
              i = 1;
             
          }
              };
          System.out.println(p.isPrime(13));
          
          EvenNumber e = (n)->n%2==1;
          System.out.println(e.isEven(5));
    }
}
