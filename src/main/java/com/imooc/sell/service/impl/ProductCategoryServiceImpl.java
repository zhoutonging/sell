package com.imooc.sell.service.impl;

import com.imooc.sell.mapper.ProductCategoryMapper;
import com.imooc.sell.model.ProductCategory;
import com.imooc.sell.service.ProductCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 类目业务逻辑层实现类
 *
 * @author : ZHOUTONG
 * @date : 2019/7/8 12:01
 */
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return productCategoryMapper.save(productCategory);
    }

    @Override
    public ProductCategory findById(Integer id) {
        return productCategoryMapper.findById(1).orElse(null);
    }

    @Override
    public List<ProductCategory> findAll() {
        return productCategoryMapper.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return productCategoryMapper.findByCategoryTypeIn(categoryTypeList);
    }
}
