package com.imooc.sell.mapper;

import com.imooc.sell.model.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 类目数据访问层
 *
 * @author : ZHOUTONG
 * @date : 2019/7/8 09:14
 */
public interface ProductCategoryMapper extends JpaRepository<ProductCategory, Integer> {

    /**
     * 根据类目编号列表查询类目信息
     *
     * @param categoryTypeList
     * @return
     */
    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);
}
