package com.design.flyweight;/**
 * Created by hdw on 2018/10/31.
 */

import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/14.
 */
@Log4j
public class Test {
    public static void main(String[] args) {
        IgoChessmanFactory factory = IgoChessmanFactory.getInstance();
        IgoChessman white1 = factory.getIgoChessman("w");
        IgoChessman white2 = factory.getIgoChessman("w");
        IgoChessman white3 = factory.getIgoChessman("w");
        IgoChessman white4 = factory.getIgoChessman("w");

        System.out.println(white1 == white2);
        System.out.println(white3 == white4);

        IgoChessman black1 = factory.getIgoChessman("b");
        IgoChessman black2 = factory.getIgoChessman("b");
        IgoChessman black3 = factory.getIgoChessman("b");
        IgoChessman black4 = factory.getIgoChessman("b");
        System.out.println(black1 == black2);
        System.out.println(black3 == black4);

        Coordinates coordinates1 = new Coordinates(10,15);
        white1.disPlay(coordinates1);

        Coordinates coordinates2 = new Coordinates(25,30);
        white1.disPlay(coordinates2);


        Coordinates coordinates3 = new Coordinates(45,25);
        System.out.println(coordinates3);

        Coordinates coordinates4 = new Coordinates(15,100);
        System.out.println(coordinates4);


    }
}
