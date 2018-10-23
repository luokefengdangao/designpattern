package com.design.builder;/**
 * Created by hdw on 2018/10/23.
 */

import lombok.Data;
import lombok.ToString;

/**
 * @类型名称：Actor
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/10/23 14:56
 * @Version：1.0
 */

@Data
@ToString
public class Actor {

    //名字
    private String name;

    //类型
    private String type;

    //性别
    private String sex;

    //脸型
    private String face;

    //服装
    private String costume;

    //发型
    private String hairstyle;
}
