package com.design.builder.other;

import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/23.
 */
@Log4j
public class Test {

    public static void main(String[] args) {
        BikeBuilder bikeBuilder = new MoboBikeBuilder();
        BikeDirector director = new BikeDirector(bikeBuilder);
        Bike bike = director.createBike();
        log.debug(bike);
    }
}
