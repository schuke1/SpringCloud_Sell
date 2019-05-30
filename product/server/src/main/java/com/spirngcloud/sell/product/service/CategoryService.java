package com.spirngcloud.sell.product.service;


import com.spirngcloud.sell.product.dataobject.ProductCategory;

import java.util.List;

/**
 * 类目
 * @author schuke
 * @date 2019/5/28 23:13
 */
public interface CategoryService {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
