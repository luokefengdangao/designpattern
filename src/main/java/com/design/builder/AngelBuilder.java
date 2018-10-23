package com.design.builder;/**
 * Created by hdw on 2018/10/23.
 */

import lombok.extern.log4j.Log4j;

/**
 * @类型名称：AngelBuilder
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/10/23 15:03
 * @Version：1.0
 */

@Log4j
public class AngelBuilder extends ActorBuilder{

    @Override
    public void buildName() {
        log.debug("AngelBuilder buildName ");
        actor.setName("天使");
    }

    @Override
    public void buildType() {
        log.debug("AngelBuilder buildType ");
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        log.debug("AngelBuilder buildSex ");
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        log.debug("AngelBuilder buildFace ");
        actor.setFace("瓜子脸");
    }

    @Override
    public void buildCostume() {
        log.debug("AngelBuilder buildCostume ");
        actor.setCostume("裙子");
    }

    @Override
    public void buildHairstyle() {
        log.debug("AngelBuilder buildHairstyle ");
        actor.setHairstyle("长头发");
    }
}
