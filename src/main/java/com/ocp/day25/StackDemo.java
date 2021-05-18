
package com.ocp.day25;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Product>box = new Stack<>();
        //將書本放進箱子
        box.push(new Product("書本-Java", 100));
        box.push(new Product("書本-Python", 80));
        box.push(new Product("書本-C#", 60));
        //從箱子中取出每一本書
        while(!box.isEmpty()){
            Product product = box.pop();
            System.out.println("書名: "+product.getName());
        }
        System.out.println("箱子裡的書: "+box);
    }
}
