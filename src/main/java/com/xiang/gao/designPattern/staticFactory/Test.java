package com.xiang.gao.designPattern.staticFactory;

/**
 * @author Administrator
 * @crdate 2017-10-13 13:36
 */
public class Test {

    public static void main(String[] args) {

        String loginType = "password";

        String password = "123456";

        String username = "x.gao";

        Login login = LoginManager.factory(loginType);

        boolean verify = login.verify(password, username);

        if (verify) {
            System.out.println("登录成功");
        } else {
            System.out.println("登录失败");
        }
    }


}
