package com.springcloud.sell.order.exception;

import com.springcloud.sell.order.enums.ResultEnum;

/**
 * @author schuke
 * @date 2019/5/29 20:57
 */
public class OrderException extends RuntimeException {

    private Integer code;

    public OrderException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public OrderException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
