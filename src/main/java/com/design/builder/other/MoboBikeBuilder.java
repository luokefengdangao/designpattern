package com.design.builder.other;

/**
 * Created by hwd on 2018/10/23.
 */
public class MoboBikeBuilder extends BikeBuilder {
    @Override
    public BikeBuilder buildName(BikeBuilder builder) {
        bike.setName("摩拜自行车");
        return builder;
    }

    @Override
    public BikeBuilder buildColr(BikeBuilder builder) {
        bike.setColor("橙色");
        return builder;
    }
}
