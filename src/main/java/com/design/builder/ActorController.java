package com.design.builder;

/**
 * Created by hwd on 2018/10/23.
 */
public class ActorController {

    public Actor buildActor(ActorBuilder actorBuilder){
        Actor actor = null;
        actorBuilder.buildHairstyle();
        actorBuilder.buildFace();
        actorBuilder.buildCostume();
        actorBuilder.buildName();
        actorBuilder.buildSex();
        actorBuilder.buildType();
        actor = actorBuilder.createActor();
        return actor;
    }
}
