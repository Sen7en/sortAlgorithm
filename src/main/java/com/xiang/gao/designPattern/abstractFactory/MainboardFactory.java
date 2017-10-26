package com.xiang.gao.designPattern.abstractFactory;

/**
 * @author Administrator
 * @crdate 2017-10-16 11:20
 */
@Deprecated
public class MainboardFactory {
    public static Mainboard createMainboard(int type) {
        Mainboard mainboard = null;

        if (type == 1) {
            return new InterMainboard(755);
        } else if (type == 2) {
            return new AmdMainboard(938);
        }
        return mainboard;
    }
}
