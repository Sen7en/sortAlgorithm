package com.xiang.gao.designPattern.builderFactory;

/**
 * Created by Administrator on 2017/10/23.
 */
public interface Builder {
    /**
     * 抽象建造者builder
     */

    void buildPart1();

    void buildPart2();

    Product retrieveResult();
}
