package com.design.builder;/**
 * Created by hdw on 2018/10/23.
 */

import lombok.extern.log4j.Log4j;

/**
 * @类型名称：HeroBuilder
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/10/23 15:01
 * @Version：1.0
 */

@Log4j
public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildName() {
        log.debug("HeroBuilder buildName ");
        actor.setName("英雄");
    }

    @Override
    public void buildType() {
        log.debug("HeroBuilder buildType ");
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        log.debug("HeroBuilder buildSex ");
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        log.debug("HeroBuilder buildFace ");
        actor.setFace("国字脸");
    }

    @Override
    public void buildCostume() {
        log.debug("HeroBuilder buildCostume ");
        actor.setCostume("西装");
    }

    @Override
    public void buildHairstyle() {
        log.debug("HeroBuilder buildHairstyle ");
        actor.setHairstyle("平头");
    }
}
