package com.xiang.gao.thread;

/**
 * yield测式用例
 *
 * @author Administrator
 * @crdate 2017-12-1 16:55
 */
public class ThreadYield extends Thread {
    /**
     * sleep()和yield()方法的区别
     * sleep方法使当前线程进入停滞状态
     * yield方法是使用线程重回可执行状态，但是有可能在进入可执行状态后马上又被执行了
     */

    public ThreadYield(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("" + this.getName() + "-----" + i);
            if (i == 30) {
                yield();
            }
        }
    }

}
