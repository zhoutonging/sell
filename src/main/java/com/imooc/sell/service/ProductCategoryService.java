package com.imooc.sell.service;

import com.imooc.sell.model.ProductCategory;

import java.util.List;

/**
 * 类目业务逻辑层
 *
 * @author : ZHOUTONG
 * @date : 2019/7/8 11:56
 */
public interface ProductCategoryService {

    /**
     * 新增类目OR更新类目
     *
     * @param productCategory
     * @return
     */
    ProductCategory save(ProductCategory productCategory);

    /**
     * 根据Id查询信息
     *
     * @param id
     * @return
     */
    ProductCategory findById(Integer id);

    /**
     * 查询类目列表
     *
     * @return
     */
    List<ProductCategory> findAll();

    /**
     * 根据类目编号列表查询类目信息
     *
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
