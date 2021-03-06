package com.xiang.gao.thread;

/**
 * Join方法
 *
 * @author Administrator
 * @crdate 2017-12-14 16:09
 */
public class JoinMethod {
    /**
     * join方法的作用是等待线程终止，这里需要理解的就是：该线程指的是主线程等待子线程的终止，也就是说子线程调用了join方法后面的代码只
     * 有在子线程结束了才能执行。
     * 为什么要使用join方法呢？
     * 在很多情况下，主线程生成并调用了子线程，如果子线程需要大量的耗时的运算，主线程一般会在子线程之前结束，但是如果主线程处理完事务后
     * 需要调用子线程的运算结果，也就是说主线程要在子线程执行完后结束，这个时候就需要用到join方法
     *
     */
}
