package com.xiang.gao.designPattern.abstractFactory;

/**
 * @author Administrator
 * @crdate 2017-10-16 11:30
 */
@Deprecated
public class ComputerEngineer {

    private Cpu cpu = null;

    private Mainboard mainboard = null;

    public void makeComputer(int type, int mainboard) {
        prepareHardwares(type, mainboard);
    }


    private void prepareHardwares(int cpuType, int mainboard) {
        this.cpu = CpuFactory.createCpu(cpuType);
        this.mainboard = MainboardFactory.createMainboard(mainboard);

        this.cpu.calcualte();
        this.mainboard.installCpu();
    }
}
