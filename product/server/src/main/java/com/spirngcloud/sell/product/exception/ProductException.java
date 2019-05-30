package com.spirngcloud.sell.product.exception;

import com.spirngcloud.sell.product.enums.ResultEnum;

/**
 * @author schuke
 * @date 2019/5/28 22:58
 */
public class ProductException extends RuntimeException {

    private Integer code;

    public ProductException(Integer code, String message) {
        super(message);
        this.code = code;
    }

    public ProductException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

}
