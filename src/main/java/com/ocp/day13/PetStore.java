
package com.ocp.day13;

import java.util.stream.Stream;

public class PetStore {

 
    public static void main(String[] args) {
        
        Pet a2 = new Cat();
        Pet a3 = new EPet();
       
        a2.eat();
        a2.move();
        a3.eat();
        a3.move();
        System.out.println(Animal.legs);
        
        System.out.println(Cat.legs);
        System.out.println(EPet.legs);
        //每一個寵物吃啥
        Pet[]pets={a2,a3};
        Stream.of(pets).forEach(p->p.eat());
    }
    
}
