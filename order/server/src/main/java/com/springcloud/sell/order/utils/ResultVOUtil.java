package com.springcloud.sell.order.utils;

import com.springcloud.sell.order.VO.ResultVO;

/**
 * @author schuke
 * @date 2019/5/29 21:06
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        resultVO.setData(object);
        return resultVO;
    }


}
