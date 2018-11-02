package com.design.builder.other;

/**
 * Created by hwd on 2018/10/23.
 */
public abstract class BikeBuilder {

    protected Bike bike = new Bike();

    abstract BikeBuilder buildName(BikeBuilder builder);

    abstract BikeBuilder buildColr(BikeBuilder builder);

    public Bike createBike(){
        return bike;
    }

}
