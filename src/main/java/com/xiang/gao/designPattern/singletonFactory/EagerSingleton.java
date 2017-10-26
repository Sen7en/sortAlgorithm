package com.xiang.gao.designPattern.singletonFactory;

/**
 * 饿汉式
 *
 * @author Administrator
 * @crdate 2017-10-18 16:03
 */
public class EagerSingleton {
    /**
     * 单例模式，确保一个类只有一个实例，而且自动实例化并向整个系统提供这个实例
     */

    private static EagerSingleton instance = new EagerSingleton();

    //私有够造
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }


}
