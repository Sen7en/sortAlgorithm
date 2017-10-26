package com.xiang.gao.designPattern.builderFactory;

/**
 * 具体建造者类
 *
 * @author Administrator
 * @crdate 2017-10-23 10:06
 */
public class ConcreteBuilder implements Builder {

    Product product = new Product();

    /**
     * 产品零件的建造方法1
     */
    @Override
    public void buildPart1() {
        //构建产品的第一个零件
        product.setPart1("编号9527");
    }

    /**
     * 产品零件的建造庐江2
     */
    @Override
    public void buildPart2() {
        //构建产品的第二个零件
        product.setPart2("名称：小蜗");

    }

    /**
     * 产品返回方法
     *
     * @return
     */
    @Override
    public Product retrieveResult() {
        return product;
    }
}
