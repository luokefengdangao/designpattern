package com.design.Singleton;

/**
 * Created by hwd on 2018/10/14.
 */
public class LazySingleton {
    private static volatile LazySingleton singleton = null;

    private LazySingleton(){

    }

    public static LazySingleton getSingleton(){
        if (singleton==null){
            synchronized(LazySingleton.class){
                if (singleton==null){
                    singleton = new LazySingleton();
                }
            }
        }

        return singleton;
    }
}
