package com.xiang.gao.designPattern.staticFactory;

/**
 * @author Administrator
 * @crdate 2017-10-13 13:11
 */
public class DomainLogin implements Login {
    @Override
    public boolean verify(String password, String name) {

        //跳过业务逻辑
        return true;
    }
}
