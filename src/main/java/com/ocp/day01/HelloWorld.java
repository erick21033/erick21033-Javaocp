package com.ocp.day01;

class Hi3 {

    void show() {

    }
}

class Hi extends Hi3  {

    String s = "This is my";

    @Override
    void show() {
        super.show();
        System.out.println(s);
    }

    public void print() {
        System.out.println("HelloJava's first lesson");
        System.out.println("HelloJava's first lesson");
    }

}

public class HelloWorld {

    public static void main(String[] args) {
        Hi h1 = new Hi();
        h1.show();
        h1.print();

    }

}
