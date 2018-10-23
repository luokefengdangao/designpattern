package com.design.clone.mgr;

/**
 * Created by hwd on 2018/10/22.
 */
public interface OfficialDocument extends Cloneable {
    OfficialDocument clone();

    void display();

}
