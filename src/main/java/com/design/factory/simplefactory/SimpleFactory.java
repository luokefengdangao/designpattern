package com.design.factory.simplefactory;/**
 * Created by hdw on 2018/10/13.
 */
import com.design.factory.enums.ProductEnum;
import com.design.factory.simplefactory.vo.Product;
import com.design.factory.simplefactory.vo.ProductA;
import com.design.factory.simplefactory.vo.ProductB;
import lombok.extern.log4j.Log4j;

/**
 * @类型名称：SimpleFactory
 * @功能描述：
 * @创建作者：hdw
 * @创建时间：2018/10/13 14:59
 * @Version：1.0
 */

@Log4j
public class SimpleFactory {

  /**
  　　* @Description: 抽象产品类

  　　* @param productType 产品类型
  　　* @return 产品
  　　* @author hdw
  　　* @date 2018/10/13 16:24
  　　*/
    public static Product createProduct(ProductEnum productEnum){
        Product product = null;
        switch (productEnum){
            case productA:
                product = new ProductA();
                break;
            case productB:
                product = new ProductB();
                break;
            default:
                log.debug("不支持此种类型的产品,请联系管理源。。。");

        }
        return product;
    }

}
