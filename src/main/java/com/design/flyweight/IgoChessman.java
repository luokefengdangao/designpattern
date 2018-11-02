package com.design.flyweight;

import lombok.extern.log4j.Log4j;

/**
 * Created by hdw on 2018/10/31.
 */
@Log4j
public abstract class IgoChessman {

    public abstract String getColor();

    public void disPlay(Coordinates coordinates){
        log.debug("棋子的颜色是。。"+this.getColor()+"---横坐标=="+ coordinates.getX()+"---纵坐标==="+ coordinates.getY());
    }

}
