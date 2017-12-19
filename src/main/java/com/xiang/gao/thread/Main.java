package com.xiang.gao.thread;

/**
 * @author Administrator
 * @crdate 2017-12-14 14:52
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        //--------------------------------------------------------------------------------------------------
        // Thread1 thread1 = new Thread1("a");
        // Thread1 thread11 = new Thread1("b");
        // //start方法的调用后不是马上执行多线程代码，而是使这个线程变为可运行的Runnable，什么时候运行由操作系统决定
        // thread1.start();
        // thread11.start();
        //
        // new Thread(new Thread2("c")).start();
        // new Thread(new Thread2("d")).start();

        //---------------join方法测式，没有加入join（）start--------------------
           /* System.out.println(Thread.currentThread().getName()+"主线程开始运行");
            ThreadJoin1 a = new ThreadJoin1("a");
            ThreadJoin1 b = new ThreadJoin1("b");
            a.start();
            b.start();
            System.out.println(Thread.currentThread().getName()+"主线程运行结束");*/
        //---------------end--------------------------------------------------

        //---------------加入join()方法 start--------------------------------------
           /* System.out.println(Thread.currentThread().getName()+"主线程开始运行");
            ThreadJoin1 a = new ThreadJoin1("a");
            ThreadJoin1 b = new ThreadJoin1("b");
            a.start();
            b.start();
            try {
                a.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                b.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"主线程运行结束");*/
        //-----------------------------------end---------------------------------

        //---------------yield方法测式 start--------------------------------------
           /* ThreadYield yt1 = new ThreadYield("张三");
            ThreadYield yt2 = new ThreadYield("李四");
            yt1.start();
            yt2.start();*/
        //-----------end---------------------------------------------------------

        //--------------wait方法测式打印10次abc start-----------------------------------------
           /* Object a  = new Object();
            Object b = new Object();
            Object c = new Object();

            WaitMethod pa = new WaitMethod("A", c, a);
            WaitMethod pb = new WaitMethod("B", a, b);
            WaitMethod pc = new WaitMethod("C", b, c);

            new Thread(pa).start();
            Thread.sleep(100);//睡一下保证执行顺序
            new Thread(pb).start();
            Thread.sleep(100);
            new Thread(pc).start();
            Thread.sleep(100);*/

        //--------------------------end---------------------------------------------------------

        //----------------------------------start-------------------------------------------------
        Thread thread = new Thread3(new Work());
        thread.start();
        //----------------end-----------------------------------------------------------------------
    }

}
