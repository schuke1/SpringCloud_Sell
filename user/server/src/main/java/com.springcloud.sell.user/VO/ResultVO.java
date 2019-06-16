package com.springcloud.sell.user.VO;

import lombok.Data;

/**
 * @author schuke
 * @date 2019/6/9 13:16
 */
@Data
public class ResultVO<T> {

    private Integer code;

    private String msg;

    private T data;

}
