package com.xiang.gao.thread;

/**
 * @author Administrator
 * @crdate 2017-12-14 14:22
 */
public class Thread1 extends Thread {

    /**
     * 通过继承Thread类
     */
    private String name;

    public Thread1(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "运行" + i);
        }
        try {
            sleep((int) Math.random() * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
