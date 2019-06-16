package com.springcloud.sell.user.enums;

import lombok.Getter;

/**
 * @author schuke
 * @date 2019/6/9 13:13
 */
@Getter
public enum RoleEnum {
    BUYER(1, "买家"),
    SELLER(2, "卖家"),
    ;

    private Integer code;

    private String message;

    RoleEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
