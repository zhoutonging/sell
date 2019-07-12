package com.imooc.sell.mapper;

import com.imooc.sell.model.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 * 订单详情测试类
 *
 * @author : ZHOUTONG
 * @date : 2019/7/12 13:08
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailMapperTest {

    @Autowired
    private OrderDetailMapper orderDetailMapper;

    @Test
    public void save() {
        OrderDetail orderDetail = new OrderDetail();
        String uuid = UUID.randomUUID().toString();
        orderDetail.setDetailId(uuid);
        orderDetail.setOrderId("12345667");
        orderDetail.setProductIcon("xxx.png");
        orderDetail.setProductId("123456");
        orderDetail.setProductName("皮蛋粥");
        orderDetail.setProductPrice(new BigDecimal(12.59));
        orderDetail.setProductQuantity(2);
        orderDetail.setUpdateTime(new Date());

        orderDetailMapper.save(orderDetail);
    }

    @Test
    public void findByOpenId() {
        List<OrderDetail> orderDetailList = orderDetailMapper.findByOrOrderId("12345667");
        System.out.println(orderDetailList.size());

    }
}