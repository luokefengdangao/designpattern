package com.design.builder;

import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/23.
 */
@Log4j
public class DevilBuilder extends ActorBuilder {

    @Override
    public void buildName() {
        log.debug("DevilBuilder buildName ");
        actor.setName("恶魔");
    }

    @Override
    public void buildType() {
        log.debug("DevilBuilder buildType ");
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        log.debug("DevilBuilder buildSex ");
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        log.debug("DevilBuilder buildFace ");
        actor.setFace("圆脸");
    }

    @Override
    public void buildCostume() {
        log.debug("DevilBuilder buildCostume ");
        actor.setCostume("上衣");
    }

    @Override
    public void buildHairstyle() {
        log.debug("DevilBuilder buildHairstyle ");
        actor.setHairstyle("光头");
    }
}
