package com.imooc.sell.service.impl;

import com.imooc.sell.common.enums.ProductStatusEnum;
import com.imooc.sell.mapper.ProductInfoMapper;
import com.imooc.sell.model.ProductInfo;
import com.imooc.sell.service.ProductInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author : ZHOUTONG
 * @date : 2019/7/8 20:24
 */
@Service
public class ProductInfoServiceImpl implements ProductInfoService {

    @Autowired
    private ProductInfoMapper productInfoMapper;

    @Override
    public ProductInfo save(ProductInfo productInfo) {
        return productInfoMapper.save(productInfo);
    }

    @Override
    public ProductInfo findById(String peoductId) {
        return productInfoMapper.findById(peoductId).orElse(null);
    }

    @Override
    public List<ProductInfo> findUpAll() {
        return productInfoMapper.findByProductStatus(ProductStatusEnum.UP.getCode());
    }

    @Override
    public Page<ProductInfo> findAll(Pageable pageable) {
        return productInfoMapper.findAll(pageable);
    }
}
