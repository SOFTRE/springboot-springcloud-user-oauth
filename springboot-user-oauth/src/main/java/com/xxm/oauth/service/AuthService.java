package com.xxm.oauth.service;

import com.xxm.oauth.util.AuthToken;

/*****
 * @Author: Mr Liu
 * @Date: 2019/7/7 16:23
 * @Description: com.xxm.oauth.service
 ****/
public interface AuthService {

    /***
     * 授权认证方法
     */
    AuthToken login(String username, String password, String clientId, String clientSecret);
}
