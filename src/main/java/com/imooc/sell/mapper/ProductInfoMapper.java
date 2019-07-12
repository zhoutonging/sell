package com.imooc.sell.mapper;

import com.imooc.sell.model.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 商品数据访问层
 *
 * @author : ZHOUTONG
 * @date : 2019/7/8 19:31
 */
public interface ProductInfoMapper extends JpaRepository<ProductInfo, String> {

    /**
     * 查询所有上架的商品列表
     *
     * @param productStatus
     * @return
     */
    List<ProductInfo> findByProductStatus(Integer productStatus);
}
