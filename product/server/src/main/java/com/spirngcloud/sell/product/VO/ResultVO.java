package com.spirngcloud.sell.product.VO;

import lombok.Data;

/**
 * http请求返回的最外层对象
 * @author schuke
 * @date 2019/5/28 23:16
 */
@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private Integer code;

    /**
     * 提示信息
     */
    private String msg;

    /**
     * 具体内容
     */
    private T data;

}
