
package com.ocp.day15;

import java.util.IntSummaryStatistics;
import java.util.stream.Stream;

public class Army {
    public static void main(String[] args) {
        Fighter fighter = new Fighter();
        Tank tank = new Tank();
        Truck truck = new Truck();
        
        Car[]cars = {tank,truck};
        Weapon[]weapons={fighter,tank};
        Oil[]oils = {fighter,tank,truck};
        Stream.of(cars).forEach(c->c.move());
        Stream.of(weapons).forEach(w->w.shoot());
        
        //總油耗
        IntSummaryStatistics stat = Stream.of(oils).mapToInt(Oil::spend).summaryStatistics();
        
        System.out.println(stat.getSum());
        
    }
}
