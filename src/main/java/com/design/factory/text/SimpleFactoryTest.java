package com.design.factory.text;

import com.design.factory.simplefactory.SimpleFactory;
import com.design.factory.enums.ProductEnum;
import com.design.factory.simplefactory.vo.Product;
import lombok.extern.log4j.Log4j;

/**
 * Created by hwd on 2018/10/14.
 */
@Log4j
public class SimpleFactoryTest {

    public static void main(String[] args) {

        Product product = null;
        product = SimpleFactory.createProduct(ProductEnum.productA);
        product.disPlay();
        log.debug("========产品B===========");

        product = SimpleFactory.createProduct(ProductEnum.productB);
        product.disPlay();

    }
}
