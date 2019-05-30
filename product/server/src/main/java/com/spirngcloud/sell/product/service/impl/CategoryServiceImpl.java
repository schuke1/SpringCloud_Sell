package com.spirngcloud.sell.product.service.impl;

import com.spirngcloud.sell.product.dataobject.ProductCategory;
import com.spirngcloud.sell.product.repository.ProductCategoryRepository;
import com.spirngcloud.sell.product.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author schuke
 * @date 2019/5/28 23:14
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private ProductCategoryRepository productCategoryRepository;

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryRepository.findByCategoryTypeIn(categoryTypeList);
    }
}
