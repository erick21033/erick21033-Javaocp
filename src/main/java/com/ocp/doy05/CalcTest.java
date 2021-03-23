
package com.ocp.doy05;
import com.ocp.doy05.util.Calc;
import static com.ocp.doy05.util.Calc.*;

public class CalcTest {
    public static void main(String[] args) {
        System.out.println(Calc.add(20, 10));
        System.out.println(Calc.sub(20, 10));
        System.out.println(Calc.mul(20, 10));
        System.out.println(Calc.div(20, 10));
        //省去撰寫
        System.out.println(add(20, 10));
        System.out.println(sub(20, 10));
        System.out.println(mul(20, 10));
        System.out.println(div(20, 10));
    }
}
