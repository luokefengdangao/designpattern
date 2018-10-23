package com.design.builder;

import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/23.
 */

@Log4j
public class Test {

    public static void main(String[] args) {
        ActorBuilder actorBuilder = new DevilBuilder();
        ActorController actorController = new ActorController();
        Actor actor = actorController.buildActor(actorBuilder);
        log.debug(actor);
    }


}
