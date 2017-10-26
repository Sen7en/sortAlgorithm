package com.xiang.gao.designPattern.abstractFactory;

/**
 * @author Administrator
 * @crdate 2017-10-16 10:31
 */
public class IntelCpu implements Cpu {
    /**
     * cpu的针脚数
     */

    private int pins = 0;

    public IntelCpu(int pins) {
        this.pins = pins;
    }

    @Override
    public void calcualte() {
        System.out.println("Inter CPU的针角数" + pins);
    }


}
