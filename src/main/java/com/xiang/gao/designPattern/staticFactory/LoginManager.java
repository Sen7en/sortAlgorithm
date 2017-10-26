package com.xiang.gao.designPattern.staticFactory;

/**
 * @author Administrator
 * @crdate 2017-10-13 13:18
 */
public class LoginManager {

    public static Login factory(String type) {
        if ("password".equals(type)) {
            return new PasswordLogin();
        } else if ("domain".equals(type)) {
            return new DomainLogin();
        } else {
            throw new RuntimeException("没有找到登录类型");
        }
    }

}
