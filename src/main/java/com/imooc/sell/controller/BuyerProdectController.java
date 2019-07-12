package com.imooc.sell.controller;

import com.imooc.sell.common.vo.ProductInfoVO;
import com.imooc.sell.common.vo.ProductVO;
import com.imooc.sell.common.vo.Result;
import com.imooc.sell.model.ProductCategory;
import com.imooc.sell.model.ProductInfo;
import com.imooc.sell.service.ProductCategoryService;
import com.imooc.sell.service.ProductInfoService;
import com.imooc.sell.utils.JsonResult;
import com.imooc.sell.utils.RedisUtil;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author : ZHOUTONG
 * @date : 2019/7/11 08:23
 */
@RestController
public class BuyerProdectController {

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private ProductInfoService productInfoService;

    @Autowired
    private ProductCategoryService productCategoryService;

    @GetMapping("/list")
    public Result list() {

        //1.先查询所有的上架商品(先查询缓存)
        List<ProductInfo> productInfoList;

        if (redisUtil.exists("productInfoList")) {
            productInfoList = (List<ProductInfo>) redisUtil.get("productInfoList");
        } else {
            productInfoList = productInfoService.findUpAll();
            redisUtil.set("productInfoList", productInfoList);
        }

        //2.根据类目编号列表查询类目信息
        List<Integer> categoryTypeList = productInfoList.stream().map(e -> e.getCategoryType()).collect(Collectors.toList());
        List<ProductCategory> productCategoryList = productCategoryService.findByCategoryTypeIn(categoryTypeList);

        //3.数据组装
        List<ProductVO> productVOList = new ArrayList<>();
        for (ProductCategory productCategory : productCategoryList) {
            ProductVO productVO = new ProductVO();
            productVO.setCategoryType(productCategory.getCategoryType());
            productVO.setCategoryName(productCategory.getCategoryName());

            List<ProductInfoVO> productInfoVOList = new ArrayList<>();
            for (ProductInfo productInfo : productInfoList) {
                if (productInfo.getCategoryType().equals(productCategory.getCategoryType())) {
                    ProductInfoVO productInfoVO = new ProductInfoVO();

                    BeanUtils.copyProperties(productInfo, productInfoVO);
                    productInfoVOList.add(productInfoVO);
                }
            }

            productVO.setProductInfoVOList(productInfoVOList);
            productVOList.add(productVO);
        }

        return JsonResult.success(productVOList);

    }
}
