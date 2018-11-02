package com.design.builder.other;

import lombok.AllArgsConstructor;

/**
 * Created by hwd on 2018/10/23.
 */
@AllArgsConstructor
public class BikeDirector {

    private BikeBuilder bikeBuilder;

    public Bike createBike(){
        Bike bike = bikeBuilder.buildColr(bikeBuilder).buildName(bikeBuilder).createBike();
        return bike;
    }
}
