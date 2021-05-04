
package com.ocp.day22;

import java.util.Arrays;
import java.util.Random;

public class Lotto {
    private String value;
    private static Lotto lottoinstance = new Lotto();
    public static Lotto getLotto(){
        return lottoinstance;
    }
    
    private Lotto(){
         Random r = new Random();
        int []values = {
            r.nextInt(9)+1,
            r.nextInt(9)+1,
            r.nextInt(9)+1,
            r.nextInt(9)+1
        };
        value = Arrays.toString(values);
    }
    public String getValue(){
       return value;
    }
}
