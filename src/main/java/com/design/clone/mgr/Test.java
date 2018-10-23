package com.design.clone.mgr;

import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/22.
 */
@Log4j
public class Test {

    public static void main(String[] args) {
        PropertyMgr propertyMgr = PropertyMgr.getPropertyMgr();
        OfficialDocument far1 = propertyMgr.getOff("far");
        far1.display();
        OfficialDocument far2 = propertyMgr.getOff("far");
        far2.display();
        log.debug(far1 == far2);


        OfficialDocument srs = propertyMgr.getOff("srs");
        srs.display();
        OfficialDocument srs1 = propertyMgr.getOff("srs");
        srs1.display();
        log.debug(srs == srs1);
    }
}
