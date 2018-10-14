package com.design.factory.simplefactory.vo;/**
 * Created by hdw on 2018/10/13.
 */

import lombok.extern.log4j.Log4j;

/**
 * @类型名称：ProductB
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/10/13 15:00
 * @Version：1.0
 */

@Log4j
public class ProductB implements Product {

    @Override
    public void disPlay() {
        log.debug("生产产品B。。。");

    }
}
