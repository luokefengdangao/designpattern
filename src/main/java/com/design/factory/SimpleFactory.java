package com.design.factory;/**
 * Created by hdw on 2018/10/13.
 */
import com.design.factory.enums.ProductEnum;
import com.design.factory.vo.Product;
import com.design.factory.vo.ProductA;
import com.design.factory.vo.ProductB;
import lombok.extern.log4j.Log4j;
import org.apache.commons.lang3.StringUtils;

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
    public static Product createProduct(String productType){
        Product product = null;
        if (StringUtils.equals(ProductEnum.productA.getProductCode(),productType)){
            product = new ProductA();
        }
        else if (StringUtils.equals(ProductEnum.productB.getProductCode(),productType)){
            product = new ProductB();
        }
        else{
            log.debug("不支持此种类型的产品,请联系管理源。。。");
        }

        return product;
    }

}
