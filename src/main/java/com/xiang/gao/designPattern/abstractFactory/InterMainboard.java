package com.xiang.gao.designPattern.abstractFactory;

/**
 * @author Administrator
 * @crdate 2017-10-16 10:59
 */
public class InterMainboard implements Mainboard {
    private int cpuHoles;

    public InterMainboard(int cpuHoles) {
        this.cpuHoles = cpuHoles;
    }

    @Override
    public void installCpu() {

        System.out.println("Inter主板的CPU插槽孔数是：" + cpuHoles);
    }

}
