package com.design.Singleton.text;

import com.design.Singleton.SimpleSingleTon;
import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/14.
 */
@Log4j
public class SimpleSingleTonTest {
    public static void main(String[] args) {
        SimpleSingleTon s1 = SimpleSingleTon.createSingleTon();
        SimpleSingleTon s2 = SimpleSingleTon.createSingleTon();
        log.debug(s1==s2);
    }
}
