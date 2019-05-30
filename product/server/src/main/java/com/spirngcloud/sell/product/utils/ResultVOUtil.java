package com.spirngcloud.sell.product.utils;

import com.spirngcloud.sell.product.VO.ResultVO;

/**
 * @author schuke
 * @date 2019/5/28 23:16
 */
public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
}
