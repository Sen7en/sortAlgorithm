package com.xiang.gao.thread;

/**
 * 实现RUNNABLE接口
 *
 * @author Administrator
 * @crdate 2017-12-14 15:13
 */
public class Thread2 implements Runnable {

    private String name;

    public Thread2(String name) {
        this.name = name;
    }


    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name + "runnable" + i);
        }
        try {
            Thread.sleep((int) Math.random() * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
