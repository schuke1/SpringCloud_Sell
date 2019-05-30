package com.springcloud.sell.product.common;

import lombok.Data;

/**
 * @author schuke
 * @date 2019/5/28 23:04
 */
@Data
public class DecreaseStockInput {

    private String productId;

    private Integer productQuantity;

    public DecreaseStockInput() {
    }

    public DecreaseStockInput(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
