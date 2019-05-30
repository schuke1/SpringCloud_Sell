package com.spirngcloud.sell.product.enums;

import lombok.Getter;

/**
 * 商品上下架状态
 * @author schuke
 * @date 2019/5/28 22:56
 */
@Getter
public enum  ProductStatusEnum {

    UP(0, "在架"),
    DOWN(1, "下架"),
            ;

    private Integer code;

    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
