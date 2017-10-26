package com.xiang.gao.designPattern.abstractFactory.example;

import com.xiang.gao.designPattern.abstractFactory.Cpu;
import com.xiang.gao.designPattern.abstractFactory.IntelCpu;
import com.xiang.gao.designPattern.abstractFactory.InterMainboard;
import com.xiang.gao.designPattern.abstractFactory.Mainboard;

/**
 * @author Administrator
 * @crdate 2017-10-18 14:34
 */
public class InterFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new IntelCpu(755);
    }


    @Override
    public Mainboard createMainboard() {
        return new InterMainboard(755);
    }

}
