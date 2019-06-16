package com.springcloud.sell.user.repository;

import com.springcloud.sell.user.dataobject.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author schuke
 * @date 2019/6/4 18:30
 */
public interface UserInfoRepository extends JpaRepository <UserInfo, String> {

    UserInfo findByOpenid(String openid);
}
