package com.xiang.gao.thread;

/**
 * join方法测式用的
 *
 * @author Administrator
 * @crdate 2017-12-14 16:27
 */
public class ThreadJoin1 extends Thread {
    private String name;

    public ThreadJoin1(String name) {
        super(name);
        this.name = name;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "线程开始");
        for (int i = 0; i < 20; i++) {
            System.out.println("子线程" + name + "运行" + i);
            try {
                sleep((int) Math.random() * 10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + "线程结束");

    }
}


