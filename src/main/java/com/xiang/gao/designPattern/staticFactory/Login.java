package com.xiang.gao.designPattern.staticFactory;

/**
 * Created by Administrator on 2017/10/13.
 */
public interface Login {
    //登录验证
    boolean verify(String password, String name);
}
