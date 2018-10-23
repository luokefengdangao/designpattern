package com.design.builder.other;

/**
 * Created by hwd on 2018/10/23.
 */
public class OfoBikeBuilder extends BikeBuilder {
    @Override
    public BikeBuilder buildName(BikeBuilder builder) {
        bike.setName("OFO 自行车");
        return builder;
    }

    @Override
    public BikeBuilder buildColr(BikeBuilder builder) {
        bike.setColor("黄色");
        return builder;
    }
}
