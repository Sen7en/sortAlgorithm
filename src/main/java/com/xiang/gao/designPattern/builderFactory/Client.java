package com.xiang.gao.designPattern.builderFactory;

/**
 * 客户端类
 *
 * @author Administrator
 * @crdate 2017-10-24 17:15
 */
public class Client {
    public static void main(String[] args) {

        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());

    }
}
