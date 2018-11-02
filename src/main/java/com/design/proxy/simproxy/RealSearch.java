package com.design.proxy.simproxy;/**
 * Created by hdw on 2018/11/2.
 */

/**
 * @类型名称：RealSearch
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/11/2 17:31
 * @Version：1.0
 */

public class RealSearch implements Search {
    @Override
    public void doSearch() {
        System.out.println("RealSearch  doSearch......");
    }
}
