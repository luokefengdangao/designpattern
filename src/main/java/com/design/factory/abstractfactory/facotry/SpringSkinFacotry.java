package com.design.factory.abstractfactory.facotry;

import com.design.factory.abstractfactory.inter.*;
import com.design.factory.abstractfactory.product.spring.SpringSkinButton;
import com.design.factory.abstractfactory.product.spring.SpringSkinTextField;
import com.design.factory.abstractfactory.product.spring.SpringSkinTree;
import com.design.factory.abstractfactory.product.spring.StringSkinComboxButton;

/**
 * Created by hwd on 2018/10/14.
 */
public class SpringSkinFacotry implements SkinFactory {
    @Override
    public Buttion createButton() {
        return new SpringSkinButton();
    }

    @Override
    public TextField crateTextField() {
        return new SpringSkinTextField();
    }

    @Override
    public ComboxButton createComboxButton() {
        return new StringSkinComboxButton();
    }

    @Override
    public Tree createTree() {
        return new SpringSkinTree();
    }
}
