package com.design.proxy.simproxy;/**
 * Created by hdw on 2018/11/2.
 */

/**
 * @类型名称：Test
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/11/2 17:38
 * @Version：1.0
 */

public class Test {

    public static void main(String[] args) {
        Search search = new RealSearch();
        search.doSearch();
    }
}
