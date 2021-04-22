package com.ocp.day16;

public class TransactionMain {
    public static void main(String[] args) {
      //amount = 10, price 35
      Transaction t = (a,p)->System.out.println("a*p");
      t.print(10, 35);
    }
}
