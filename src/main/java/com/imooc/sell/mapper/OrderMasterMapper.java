package com.imooc.sell.mapper;

import com.imooc.sell.model.OrderMaster;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * 订单数据访问层
 *
 * @author : ZHOUTONG
 * @date : 2019/7/12 09:17
 */
public interface OrderMasterMapper extends JpaRepository<OrderMaster, String> {

    /**
     * 根据openId查询用户订单
     *
     * @param buyerOpenid
     * @return
     */
    Page<OrderMaster> findByBuyerOpenid(String buyerOpenid, Pageable pageable);


}
