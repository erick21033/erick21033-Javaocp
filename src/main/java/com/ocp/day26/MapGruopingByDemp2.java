
package com.ocp.day26;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapGruopingByDemp2 {
    public static void main(String[] args) {
        //1~9 隨機取 100 次, 每一個號碼各會取道幾次
        List<Integer>nums = new ArrayList<>();
        Random r = new Random();
        
        for(int i = 0;i<100;i++){
            nums.add(r.nextInt(9)+1);
        }
        System.out.println(
                nums.stream()
                        .collect(Collectors
                        .groupingBy(Function.identity(),Collectors.counting()))
        );
        
    }
}
