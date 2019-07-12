package com.imooc.sell.mapper;

import com.imooc.sell.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * 订单详情数据访问层
 *
 * @author : ZHOUTONG
 * @date : 2019/7/12 09:22
 */
public interface OrderDetailMapper extends JpaRepository<OrderDetail, String> {

    /**
     * 根据订单Id查询订单详情(一个订单对应多个详情)
     *
     * @param orderId
     * @return
     */
    List<OrderDetail> findByOrOrderId(String orderId);
}
