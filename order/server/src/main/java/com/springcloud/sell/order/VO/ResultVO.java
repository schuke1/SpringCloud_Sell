package com.springcloud.sell.order.VO;

import lombok.Data;

/**
 * @author schuke
 * @date 2019/5/29 21:06
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

}
