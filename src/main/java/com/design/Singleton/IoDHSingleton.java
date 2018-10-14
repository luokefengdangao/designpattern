package com.design.Singleton;

/**
 * Created by hwd on 2018/10/14.
 */

public class IoDHSingleton {
    private IoDHSingleton(){

    }

    private static class HolderClass{
       private HolderClass(){
           System.out.println("内部类开始加载.....");
       }
        private static final IoDHSingleton singleton = new IoDHSingleton();
    }

    public static IoDHSingleton getSingleTon(){
        return HolderClass.singleton;
    }


}
