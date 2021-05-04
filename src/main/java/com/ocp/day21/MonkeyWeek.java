package com.ocp.day21;

public class MonkeyWeek {
    public static void main(String[] args) {
        work(Week.MON);
        
    }
    public static void work(Week week){
        switch(week){
            case MON:
                System.out.println("穿新衣");
                break;
            case TUE:
                System.out.println("烤肉");
                break;
        }
    }
}
