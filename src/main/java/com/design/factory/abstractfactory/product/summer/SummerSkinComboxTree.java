package com.design.factory.abstractfactory.product.summer;

import com.design.factory.abstractfactory.inter.ComboxButton;
import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/14.
 */
@Log4j
public class SummerSkinComboxTree implements ComboxButton {
    @Override
    public void display() {
        log.debug("SummerSkin ComboxButton...");
    }
}
