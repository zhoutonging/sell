package com.imooc.sell.service;

import com.imooc.sell.common.dto.OrderDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * 订单业务逻辑层
 *
 * @author : ZHOUTONG
 * @date : 2019/7/12 13:43
 */
public interface OrderService {

    /**
     * 创建订单(一个订单最起码包括一个订单详情)
     *
     * @param orderMasterDto
     * @return
     */
    OrderDto save(OrderDto orderMasterDto);

    /**
     * 查询单个订单
     *
     * @param orderId
     * @return
     */
    OrderDto findByOrderId(String orderId);

    /**
     * 查询订单列表
     *
     * @param buyerOpenid
     * @param pageable
     * @return
     */
    Page<OrderDto> findList(String buyerOpenid, Pageable pageable);

    /**
     * 取消订单
     *
     * @param orderDto
     * @return
     */
    OrderDto canceel(OrderDto orderDto);

    /**
     * 完结订单
     *
     * @param orderDto
     * @return
     */
    OrderDto finish(OrderDto orderDto);

    /**
     * 支付订单
     *
     * @param orderDto
     * @return
     */
    OrderDto paid(OrderDto orderDto);
}
