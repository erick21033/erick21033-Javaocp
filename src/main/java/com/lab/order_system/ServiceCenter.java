package com.lab.order_system;

import java.util.Set;

public class ServiceCenter {

    private Set<Food> catalog = new DataCenter().getCatalog();
    //根據no來查找Food
    public Food getFoddByNO(int no){
        return catalog.stream()
                .filter(food->food.getNo()==no)
                .findFirst()
                .get();
    }
    //檢視Catalog
    public void printCatalog() {
        System.out.println("訂單系統");
        System.out.println("+------------------");
        System.out.println("|NO|  品名  |尺寸|Price|");
        System.out.println("+------------------");
        for (Food food : catalog) {
            System.out.printf("|%2d|%s|　%c|%5d|\n",
                    food.getNo(), food.getName(), food.getSize(), food.getPrice());
        }
        System.out.println("--------------");
    }
}
