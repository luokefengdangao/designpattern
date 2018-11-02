package com.design.chain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

/**
 * Created by hdw on 2018/11/2.
 */
@AllArgsConstructor
@NoArgsConstructor
public abstract class Approver {

    protected Approver approver;
    protected String name;

    public abstract void processRequest(PurchaseRequest purchaseRequest);


}
