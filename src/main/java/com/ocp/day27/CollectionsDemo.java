package com.ocp.day27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {
        List<Integer>nums = new ArrayList<>();
        nums.add(100);nums.add(80);nums.add(90);
        System.out.println(Collections.max(nums));
        System.out.println(Collections.min(nums));
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);
        
        Comparator<Integer>com = (o1,o2)->o2-o1;
        Collections.sort(nums,com);
        System.out.println(nums);
    }
}
