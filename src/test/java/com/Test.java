package com;/**
 * Created by hdw on 2018/10/13.
 */

import lombok.extern.log4j.Log4j;

import java.util.Date;

/**
 * @类型名称：Test
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/10/13 15:09
 * @Version：1.0
 */

@Log4j
public class Test {

    public static void main(String[] args) {
        LombokVO vo = new LombokVO();
        vo.setName("hdw");
        vo.setAge(10);
        vo.setBirthDay(new Date());
        log.debug(vo);
    }


}
