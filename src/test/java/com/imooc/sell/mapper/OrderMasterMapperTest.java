package com.imooc.sell.mapper;

import com.imooc.sell.model.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * 订单测试类
 *
 * @author : ZHOUTONG
 * @date : 2019/7/12 13:09
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterMapperTest {

    @Autowired
    private OrderMasterMapper orderMasterMapper;

    private final String openId = "123456789";

    @Test
    public void save() {
        OrderMaster orderMaster = new OrderMaster();
        String uuid = UUID.randomUUID().toString();
        orderMaster.setOrderId(uuid);
        orderMaster.setBuyerName("CC");
        orderMaster.setBuyerPhone("15152193590");
        orderMaster.setBuyerAddress("江苏师范大学");
        orderMaster.setBuyerOpenid(openId);
        orderMaster.setOrderAmount(new BigDecimal(3.5));
        orderMaster.setCreateTime(new Date());
        orderMaster.setUpdateTime(new Date());

        orderMasterMapper.save(orderMaster);
    }

    @Test
    public void findByBuyerOpenid() throws Exception {
        PageRequest request = PageRequest.of(0, 1);
        Page<OrderMaster> orderMasterPage = orderMasterMapper.findByBuyerOpenid(openId, request);
        System.err.println(orderMasterPage);
    }

}