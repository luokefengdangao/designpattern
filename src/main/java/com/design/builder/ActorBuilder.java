package com.design.builder;

/**
 * Created by hdw on 2018/10/23.
 */
public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    abstract void buildName();

    abstract void buildType();

    abstract void buildSex();

    abstract void buildFace();

    abstract void buildCostume();

    abstract void buildHairstyle();

    Actor createActor(){
        return actor;
    }

}
