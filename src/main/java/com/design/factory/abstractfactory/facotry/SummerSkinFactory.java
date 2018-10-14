package com.design.factory.abstractfactory.facotry;

import com.design.factory.abstractfactory.inter.*;
import com.design.factory.abstractfactory.product.summer.SummerSkinButton;
import com.design.factory.abstractfactory.product.summer.SummerSkinComboxTree;
import com.design.factory.abstractfactory.product.summer.SummerSkinTextField;
import com.design.factory.abstractfactory.product.summer.SummerSkinTree;

/**
 * Created by hwd on 2018/10/14.
 */
public class SummerSkinFactory implements SkinFactory {
    @Override
    public Buttion createButton() {
        return new SummerSkinButton();
    }

    @Override
    public TextField crateTextField() {
        return new SummerSkinTextField();
    }

    @Override
    public ComboxButton createComboxButton() {
        return new SummerSkinComboxTree();
    }

    @Override
    public Tree createTree() {
        return new SummerSkinTree();
    }
}
