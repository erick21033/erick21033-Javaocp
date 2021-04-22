package com.ocp.day16;

public class DeptDemo {

    public static void main(String[] args) {
        //第一種
        Dept dept = new Dept();
        Dept.Stuff stuff = dept.new Stuff();
          stuff.jod();
        //第二種
        Dept.Stuff stuff2 = new Dept().new Stuff();
        stuff2.jod();
        //第三種
        new Dept().new Stuff().jod();
    }
}
