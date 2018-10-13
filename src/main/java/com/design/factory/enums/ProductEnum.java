package com.design.factory.enums;/**
 * Created by hdw on 2018/10/13.
 */

/**
 * @类型名称：ProductEnum
 * @功能描述： 产品类型枚举
 * @创建作者：hdw
 * @创建时间：2018/10/13 16:29
 * @Version：1.0
 */

public enum  ProductEnum {

    productA("A"),
    productB("B");

    private ProductEnum(String productCode){
        this.productCode = productCode;
    }
    private String productCode;

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }
}
