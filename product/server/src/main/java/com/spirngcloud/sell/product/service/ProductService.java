package com.spirngcloud.sell.product.service;

import com.springcloud.sell.product.common.DecreaseStockInput;
import com.springcloud.sell.product.common.ProductInfoOutput;
import com.spirngcloud.sell.product.dataobject.ProductInfo;

import java.util.List;

/**
 * @author schuke
 * @date 2019/5/28 23:13
 */
public interface ProductService {

    /**
     * 查询所有在架商品列表
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询商品列表
     * @param productIdList
     * @return
     */
    List<ProductInfoOutput> findList(List<String> productIdList);

    /**
     * 扣库存
     * @param decreaseStockInputList
     */
    void decreaseStock(List<DecreaseStockInput> decreaseStockInputList);
}
