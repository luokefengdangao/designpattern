package com.design.clone.simpleclone;

/**
 * Created by hwd on 2018/10/14.
 */
public class ConcretePrototype implements Prototype {

    private String attr;
    @Override
    public Prototype clone() {
        Prototype prototype = new ConcretePrototype();
        prototype.setAttr(this.attr);
        return prototype;
    }

    public String getAttr() {
        return attr;
    }

    public void setAttr(String attr) {
        this.attr = attr;
    }
}
