package com.design.clone.simpleclone;

/**
 * Created by hwd on 2018/10/14.
 */
public interface Prototype {

    public Prototype clone();

    public void setAttr(String attr);

    public String getAttr();
}
