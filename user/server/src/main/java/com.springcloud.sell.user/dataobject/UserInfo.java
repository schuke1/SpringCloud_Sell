package com.springcloud.sell.user.dataobject;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author schuke
 * @date 2019/6/4 18:26
 */
@Data
@Entity
public class UserInfo {

    @Id
    private String id;

    private String userName;

    private String password;

    private String openid;

    private Integer role;
}
