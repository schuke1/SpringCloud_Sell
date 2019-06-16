package com.springcloud.sell.user.constant;

/**
 * @author schuke
 * @date 2019/6/9 13:14
 */
public interface CookieConstant {
    String TOKEN = "token";

    String OPENID = "openid";

    /**
     * 过期时间(单位:s)
     */
    Integer expire = 7200;
}
