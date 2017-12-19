package com.xiang.gao.thread;

/**
 * @author Administrator
 * @crdate 2017-12-15 9:50
 */
public class WaitMethod implements Runnable {
    /**
     * wait方法和notify方法必须要跟synchronized方法一起用，也就是wait和nofify是针对已经获得obj锁进行操作，从语法角度来讲就是wait
     * 和notify方法必须要在synchronized方法的代码块中执行。
     * <p>
     * wait方法从功能上来讲是在线程获取对象锁后，主动释放对象锁，同时本线程进入休眠。直到有别的线程对象的notify方法唤醒该线程，才会
     * 继续获取对象锁，并继续执行。
     * <p>
     * notify方法是对对象锁的唤醒操作，但是notify方法调用后不会马上就释放对象锁，而是在synchronized（）{}语句块执行结束后，自动释放
     * 锁后，JVM会在wait()对象锁的线程中随机选取一个线程赋予其对象锁，唤醒线程，继续执行。这样就提供了在线程间同步，唤醒的操作了
     * -----------------------------------------------------------------------------------------------------------------
     * 建立三个线程，A线程打印10次A,B线程打印10次B，C线程打印10次C,要求线程同时运行，交替打印10次ABC！
     */

    private String name;

    private Object prev;

    private Object self;

    public WaitMethod(String name, Object prev, Object self) {
        this.name = name;
        this.prev = prev;
        this.self = self;
    }

    @Override
    public void run() {
        int count = 10;
        while (count > 0) {
            synchronized (prev) {
                synchronized (self) {
                    System.out.print(name);
                    count--;

                    self.notify();
                }
                try {
                    prev.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
