package com.springcloud.sell.user.servicer.impl;

import com.springcloud.sell.user.dataobject.UserInfo;
import com.springcloud.sell.user.repository.UserInfoRepository;
import com.springcloud.sell.user.servicer.UserService;

/**
 * @author schuke
 * @date 2019/6/4 18:33
 */
public class UserServiceImpl implements UserService {

    private UserInfoRepository userInfoRepository;

    /**
     * 通过openid来查询用户信息
     *
     * @param openid
     * @return
     */
    @Override
    public UserInfo findByOpenid(String openid) {
        return userInfoRepository.findByOpenid(openid);
    }
}
