package com.design.factory.text;

import com.design.factory.abstractfactory.facotry.SummerSkinFactory;
import com.design.factory.abstractfactory.inter.*;

/**
 * Created by hwd on 2018/10/14.
 */
public class AbstractFactoryText {
    public static void main(String[] args) {

        SkinFactory factory = new SummerSkinFactory();
        Buttion button = factory.createButton();
        TextField textField = factory.crateTextField();
        Tree tree = factory.createTree();
        ComboxButton comboxButton = factory.createComboxButton();
        button.display();
        textField.display();
        comboxButton.display();
        tree.display();

    }
}
