package com.xiang.gao.designPattern.abstractFactory;

/**
 * @author Administrator
 * @crdate 2017-10-16 11:15
 */
@Deprecated
public class CpuFactory {
    public static Cpu createCpu(int type) {
        Cpu cpu = null;
        if (type == 1) {
            cpu = new IntelCpu(755);
        } else if (type == 2) {
            cpu = new AMDCpu(938);
        }

        return cpu;
    }
}
