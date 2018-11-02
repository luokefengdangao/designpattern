package com.design.chain;/**
 * Created by hdw on 2018/11/2.
 */

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @类型名称：PurchaseRequestHandler
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/11/2 18:41
 * @Version：1.0
 */

@Data
@AllArgsConstructor
public class PurchaseRequest {

    private int id;

    private String name;

    private Double account;
}
