package com.springcloud.sell.order.repository;

import com.springcloud.sell.order.dataobject.OrderMaster;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author schuke
 * @date 2019/5/29 21:02
 */
public interface OrderMasterRepository extends JpaRepository<OrderMaster, String> {
}

