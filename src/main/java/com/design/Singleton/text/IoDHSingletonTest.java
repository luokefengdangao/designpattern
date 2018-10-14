package com.design.Singleton.text;

import com.design.Singleton.IoDHSingleton;
import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/14.
 */
@Log4j
public class IoDHSingletonTest {
    public static void main(String[] args) {
        IoDHSingleton s1 = IoDHSingleton.getSingleTon();
        IoDHSingleton s2 = IoDHSingleton.getSingleTon();
        log.debug(s1==s2);
    }
}
