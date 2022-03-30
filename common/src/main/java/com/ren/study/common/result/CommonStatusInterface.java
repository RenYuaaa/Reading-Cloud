package com.ren.study.common.result;

/**
 * @author: renjiahui
 * @date: 2022-03-30 23:45
 * @description: 公共的返回代码
 */
public interface CommonStatusInterface {

    /**
     * getter方法
     *
     * @return 返回状态值
     */
    int getCode();

    /**
     * 返回结果描述
     *
     * @return 结果描述
     */
    String getText();


}
