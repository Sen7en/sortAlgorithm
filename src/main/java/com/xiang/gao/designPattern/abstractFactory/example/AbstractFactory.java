package com.xiang.gao.designPattern.abstractFactory.example;

import com.xiang.gao.designPattern.abstractFactory.Cpu;
import com.xiang.gao.designPattern.abstractFactory.Mainboard;

/**
 * @author Administrator
 * @crdate 2017-10-17 9:59
 */
public interface AbstractFactory {
    Cpu createCpu();

    Mainboard createMainboard();
}
