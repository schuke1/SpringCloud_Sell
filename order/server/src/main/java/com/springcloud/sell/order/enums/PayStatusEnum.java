package com.springcloud.sell.order.enums;

import lombok.Getter;

/**
 * @author schuke
 * @date 2019/5/29 20:55
 */
@Getter
public enum PayStatusEnum {

    WAIT(0, "等待支付"),
    SUCCESS(1, "支付成功"),
    ;
    private Integer code;

    private String message;

    PayStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

}
