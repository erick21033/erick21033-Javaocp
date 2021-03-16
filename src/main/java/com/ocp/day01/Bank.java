package com.ocp.day01;

import java.util.*;

class Account {

    Scanner sc = new Scanner(System.in);
    private int Balance;//帳戶餘額

    //自行撰寫查詢帳戶餘額
    public Account(int bal) {
        this.Balance = bal;
    }

    void withDraw() {
        System.out.print("提款金額: ");
        int money = sc.nextInt();
        System.out.println("提"+money+"元");
        if (money <= 0) {
            System.out.println("提款金額不符!!");
            return;
        } else if (money > Balance) {
            System.out.println("帳款餘額不足!!");
            return;
        }
        this.Balance -= money;

    }

    void deposit() {
        System.out.print("存款金額: ");
        int money = sc.nextInt();
        System.out.println("存"+money+"元");
        if (money < 0) {
            System.out.println("存款金額不符");
            return;
        }
        this.Balance += money;

    }

    int getBalance() {
        return Balance;
    }
}

public class Bank {

    public static void main(String[] args) {

        Account a01 = new Account(1000);
        Account a02 = new Account(5000);

        a01.deposit();
        System.out.printf("a01的帳戶餘額:",a01.getBalance());
    }

}
