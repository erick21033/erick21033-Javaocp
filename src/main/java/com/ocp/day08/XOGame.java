package com.ocp.day08;

public class XOGame {

    public static void main(String[] args) {
        char[][]xo = {{'o','x','o'},{' ','x','x'},{'o',' ',' '}};
        print(xo);
        System.out.println("輸入xo[1][0]='0'");
        xo[2][1]='o';
        print(xo);
    }
    public static void print(char [][]xo){
        for(char[]x:xo){
            System.out.print("| ");
            for(char y:x){
                System.out.print(y+" | ");
            }
            System.out.println("");
        }
    }
}
