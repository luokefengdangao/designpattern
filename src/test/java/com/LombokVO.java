package com;/**
 * Created by hdw on 2018/10/13.
 */

import lombok.Data;
import lombok.ToString;

import java.util.Date;

/**
 * @类型名称：LombokVO
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/10/13 15:06
 * @Version：1.0
 */

@Data
@ToString
public class LombokVO {

    private String name;

    private Integer age;

    private Date birthDay;

}
