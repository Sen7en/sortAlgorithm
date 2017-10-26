package com.xiang.gao.designPattern.abstractFactory;

/**
 * @author Administrator
 * @crdate 2017-10-16 10:48
 */
public class AMDCpu implements Cpu {

    private int pins;

    public AMDCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calcualte() {
        System.out.println("AMD CPU的针角数" + pins);
    }

}