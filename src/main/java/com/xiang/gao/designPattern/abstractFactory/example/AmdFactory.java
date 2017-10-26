package com.xiang.gao.designPattern.abstractFactory.example;

import com.xiang.gao.designPattern.abstractFactory.AMDCpu;
import com.xiang.gao.designPattern.abstractFactory.AmdMainboard;
import com.xiang.gao.designPattern.abstractFactory.Cpu;
import com.xiang.gao.designPattern.abstractFactory.Mainboard;

/**
 * @author Administrator
 * @crdate 2017-10-18 14:44
 */
public class AmdFactory implements AbstractFactory {
    @Override
    public Cpu createCpu() {
        return new AMDCpu(938);
    }

    @Override
    public Mainboard createMainboard() {
        return new AmdMainboard(938);
    }
}
