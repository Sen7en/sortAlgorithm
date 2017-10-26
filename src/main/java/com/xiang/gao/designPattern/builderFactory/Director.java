package com.xiang.gao.designPattern.builderFactory;

/**
 * 导演类
 *
 * @author Administrator
 * @crdate 2017-10-23 10:18
 */
public class Director {

    /**
     * 持有当前需要使用的建造者对象
     */
    private Builder builder;

    /**
     * 构造方法
     *
     * @param builder
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart1();
        builder.buildPart2();
    }
}
