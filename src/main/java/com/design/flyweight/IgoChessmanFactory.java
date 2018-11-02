package com.design.flyweight;/**
 * Created by hdw on 2018/10/31.
 */

import java.util.Hashtable;

/**
 * @类型名称：IgoChessmanFactory
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/10/31 16:41
 * @Version：1.0
 */

public class IgoChessmanFactory {


    private static IgoChessmanFactory instance = new IgoChessmanFactory();
    private static Hashtable ht; //使用Hashtable来存储享元对象，充当享元池
    private IgoChessmanFactory() {
        ht = new Hashtable();
        IgoChessman black,white;
        black = new BlackIgoChessman();
        ht.put("b",black);
        white = new WhiteIgoChessman();
        ht.put("w",white);
    }
    //返回享元工厂类的唯一实例
    public static IgoChessmanFactory getInstance() {
        return instance;
    }
    //通过key来获取存储在Hashtable中的享元对象
    public IgoChessman getIgoChessman(String color) {
        return (IgoChessman)ht.get(color);
    }

}
