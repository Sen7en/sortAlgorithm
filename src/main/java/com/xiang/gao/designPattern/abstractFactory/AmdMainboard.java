package com.xiang.gao.designPattern.abstractFactory;

/**
 * @author Administrator
 * @crdate 2017-10-16 11:10
 */
public class AmdMainboard implements Mainboard {
    private int cpuHoles;

    public AmdMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {
        System.out.println("Amd主板的Cpu插槽孔数是：" + cpuHoles);
    }
}
