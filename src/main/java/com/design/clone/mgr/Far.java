package com.design.clone.mgr;

import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/22.
 */
@Log4j
public class Far implements OfficialDocument {
    @Override
    public OfficialDocument clone() {
        Object object = null;
        try {
            object = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (OfficialDocument) object;
    }

    @Override
    public void display() {
        log.debug("可行性分析报告");
    }
}
