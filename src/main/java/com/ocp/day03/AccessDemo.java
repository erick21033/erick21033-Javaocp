
package com.ocp.day03;
import com.ocp.day03.bar.*;
import com.ocp.day03.foo.*;

public class AccessDemo {
    public static void main(String[] args) {
        John j = new John();
        Mary m = new Mary();
        m.print();
        Bob b = new Bob();
        Helen h = new Helen();
        h.print();
    }
}
