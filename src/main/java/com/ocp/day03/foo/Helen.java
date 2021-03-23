/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ocp.day03.foo;

import com.ocp.day03.bar.Eric;
import com.ocp.day03.bar.John;
public class Helen extends John implements Eric{

    public void print() {
        System.out.print("Helen: ");
        System.out.print(a + ",");
        System.out.print(b + ",");
        System.out.print(i+",");
    }
}
