package com.springcloud.sell.order.enums;

import lombok.Getter;

/**
 * @author schuke
 * @date 2019/5/29 20:54
 */
@Getter
public enum  OrderStatusEnum {

    NEW(0, "新订单"),
    FINISHED(1, "完结"),
    CANCEL(2, "取消"),
            ;
    private Integer code;

    private String message;

    OrderStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
