package com.xiang.gao.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Administrator
 * @crdate 2017-12-15 16:29
 */
public class ReenTrantLockTest {
    public static void main(String[] args) {
        //初始化可重入锁
        final Lock lock = new ReentrantLock();

        //第一个条件当屏幕上输出到3
        final Condition reachThreeCondition = lock.newCondition();

        //第二个条件当屏幕上输出到6时
        final Condition reachSixCondition = lock.newCondition();

        //只是一个封装，可以让数字对象共享，还可以是final的，这里是不能用Integer的因为Integer是不可变对象
        final NumberWrapper num = new NumberWrapper();

        //初始化线程A
        Thread threadA = new Thread(new Runnable() {
            @Override
            public void run() {
                //先获得锁
                try {
                    lock.lock();
                    //A线程先输出前3个数
                    System.out.println("ThreadA start write");
                    while (num.value <= 3) {
                        System.out.println(num.value);
                        num.value++;
                    }
                    //输出到3时，到发生signal,告诉B线程可以开始了
                    reachThreeCondition.signal();
                } finally {
                    lock.unlock();
                }
                lock.lock();
                //等待输出6的的条件
                try {
                    reachSixCondition.await();
                    //输出剩下的数字
                    System.out.println("threadA start write");
                    while (num.value <= 9) {
                        System.out.println(num.value);
                        num.value++;
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    lock.unlock();
                }

            }
        });
        //初始化线程b
        Thread threadB = new Thread(new Runnable() {
            @Override
            public void run() {
                //先获得锁
                try {
                    lock.lock();
                    while (num.value <= 3) {
                        try {
                            reachThreeCondition.await();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                } finally {
                    lock.unlock();
                }
                //等待输出6的的条件
                try {
                    lock.lock();
                    //输出4,5,6
                    System.out.println("threadB start write");
                    while (num.value <= 6) {
                        System.out.println(num.value);
                        num.value++;
                    }
                    // 4，5，6输出完毕，告诉A线程6输出完了
                    reachSixCondition.signal();
                } finally {
                    lock.unlock();
                }

            }
        });
        // 启动两个线程
        threadB.start();
        threadA.start();
    }

    /**
     * 由线程A输出1、2、3.接着线程B输出4、5、6.最后线程A再输出7、8、9
     */

    static class NumberWrapper {
        public int value = 1;
    }
}
