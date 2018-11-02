package com.design.chain;/**
 * Created by hdw on 2018/11/2.
 */

import lombok.AllArgsConstructor;

/**
 * @类型名称：Director
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/11/2 18:46
 * @Version：1.0
 */

@AllArgsConstructor
public class Director extends Approver {
    @Override
    public void processRequest(PurchaseRequest purchaseRequest) {
        if (purchaseRequest.getAccount()<5000){
            System.out.println("主任"+this.name+"审批了"+purchaseRequest.getName());
        }
        else{
            this.approver.processRequest(purchaseRequest);
        }

    }
}
