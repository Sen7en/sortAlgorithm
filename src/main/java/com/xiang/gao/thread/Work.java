package com.xiang.gao.thread;

/**
 * @author Administrator
 * @crdate 2017-12-15 15:15
 */
public class Work {

    public void process(Data data, Integer... num) {
        for (Integer n : num) {
            data.value += n;
        }
    }
}
