package com.design.factory.abstractfactory.product.spring;

import com.design.factory.abstractfactory.inter.ComboxButton;
import lombok.extern.log4j.Log4j;


@Log4j
public class StringSkinComboxButton implements ComboxButton {
    @Override
    public void display() {
        log.debug("Spring ComBoxButton......");
    }
}
