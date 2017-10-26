package com.xiang.gao.designPattern.abstractFactory.example;

import com.xiang.gao.designPattern.abstractFactory.Cpu;
import com.xiang.gao.designPattern.abstractFactory.Mainboard;

/**
 * @author Administrator
 * @crdate 2017-10-18 15:15
 */
public class ComputerEngineer {

    private Cpu cpu = null;

    private Mainboard mainboard = null;

    public void makeComputer(AbstractFactory abstractFactory) {
        prepareHardwares(abstractFactory);
    }


    private void prepareHardwares(AbstractFactory abstractFactory) {

        this.cpu = abstractFactory.createCpu();
        this.mainboard = abstractFactory.createMainboard();

        this.cpu.calcualte();
        this.mainboard.installCpu();
    }
}
