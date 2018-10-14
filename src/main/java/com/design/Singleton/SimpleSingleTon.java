package com.design.Singleton;

import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/14.
 */
@Log4j
public class SimpleSingleTon {

    private static SimpleSingleTon singleTon = null;

    private SimpleSingleTon(){

    }

    public static SimpleSingleTon createSingleTon(){
        if (singleTon == null){
            singleTon = new SimpleSingleTon();
        }
        return singleTon;
    }

    public static void display(){
        log.debug("简单单例显示.....");
    }
}
