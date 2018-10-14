package com.design.Singleton;

/**
 * Created by hwd on 2018/10/14.
 */
public class EagerSingleton {

    public static EagerSingleton singleton = new EagerSingleton();

    private EagerSingleton(){

    }
    public static EagerSingleton getSingleton(){
        return singleton;
    }
}
