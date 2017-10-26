package com.xiang.gao.designPattern.staticFactory;

/**
 * 密码登录
 *
 * @author Administrator
 * @crdate 2017-10-13 13:14
 */
public class PasswordLogin implements Login {
    @Override
    public boolean verify(String password, String name) {
        /**
         * 跳过业务处理
         */

        return true;

    }
}
