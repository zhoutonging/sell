package com.imooc.sell.service;

import com.imooc.sell.model.ProductInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

/**
 * @author : ZHOUTONG
 * @date : 2019/7/8 19:54
 */
public interface ProductInfoService {

    /**
     * 添加OR修改商品
     *
     * @param productInfo
     * @return
     */
    ProductInfo save(ProductInfo productInfo);

    /**
     * 根据商品ID查询信息
     *
     * @param peoductId
     * @return
     */
    ProductInfo findById(String peoductId);

    /**
     * 查询所有上架的商品列表
     *
     * @return
     */
    List<ProductInfo> findUpAll();

    /**
     * 查询所有的商品列表(分页)
     *
     * @param pageable
     * @return
     */
    Page<ProductInfo> findAll(Pageable pageable);

}
