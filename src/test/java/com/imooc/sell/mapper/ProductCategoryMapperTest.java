package com.imooc.sell.mapper;

import com.imooc.sell.model.ProductCategory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.Date;
import java.util.List;


/**
 * @author : ZHOUTONG
 * @date : 2019/7/8 09:18
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryMapperTest {

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

    @Test
    public void findOneTest() {
        ProductCategory productCategory = productCategoryMapper.findById(15).orElse(null);
        System.out.println(productCategory.toString());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<Integer> list = Arrays.asList(1, 12);
        List<ProductCategory> productCategories = productCategoryMapper.findByCategoryTypeIn(list);
        System.out.println(productCategories.size());
    }
}