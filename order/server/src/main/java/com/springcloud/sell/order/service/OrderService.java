package com.springcloud.sell.order.service;

import com.springcloud.sell.order.dto.OrderDTO;

/**
 * @author schuke
 * @date 2019/5/29 21:03
 */
public interface OrderService {


    /**
     * 创建订单
     * @param orderDTO
     * @return
     */
    OrderDTO create(OrderDTO orderDTO);

    /**
     * 完结订单(只能卖家操作)
     * @param orderId
     * @return
     */
    OrderDTO finish(String orderId);

}
