package com.springcloud.sell.user.servicer;

import com.springcloud.sell.user.dataobject.UserInfo;

/**
 * @author schuke
 * @date 2019/6/4 18:32
 */
public interface UserService {

    /**
     * 通过Openid来查询用户信息
     * @param openid 微信的openid
     * @return
     */
    UserInfo findByOpenid(String openid);
}
