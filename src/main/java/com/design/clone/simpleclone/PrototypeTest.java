package com.design.clone.simpleclone;

import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/14.
 */
@Log4j
public class PrototypeTest {
    public static void main(String[] args) {
        Prototype prototype = new ConcretePrototype();
        prototype.setAttr("hdw");
        Prototype prototype1 = prototype.clone();
        log.debug(prototype == prototype1);
        log.debug(prototype.getClass() == prototype1.getClass());

    }
}
