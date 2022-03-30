package com.ren.study.common.constant;

/**
 * @author: renjiahui
 * @date: 2022-03-30 23:45
 * @description: JWT常量
 */
public class JwtConstant {

    /**
     * JWT密钥，后期加密放入配置中心
     */
    public final static String SECRET_KEY = "someday";

    /**
     * 过期时间天数
     */
    public final static int EXPIRE_DAY = 7;

}
