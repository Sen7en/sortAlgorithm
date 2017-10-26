package com.xiang.gao.sort;

/**
 * 希尔排序
 *
 * @author Administrator
 * @crdate 2017-10-09 10:58
 */
public class ShellSort {

    //第一种
    public static void shellSort(int[] array) {
        int temp;
        int step = array.length;
        while (true) {
            step = step / 2;
            for (int i = 0; i < step; i++) {
                for (int j = i + step; j < array.length; j = j + step) {
                    temp = array[j];
                    int k;
                    for (k = j - step; k >= 0; k = k - step) {
                        if (array[k] > temp) {
                            array[k + step] = array[k];
                        } else {
                            break;
                        }
                    }
                    array[k + step] = temp;
                }
            }
            if (step == 1) {
                break;
            }
        }
    }

    //第二种
    public static void shell2Sort(int[] array) {
        if (array.length < 1 || array == null) {
            return;
        }
        //增量
        int incrementNum = array.length / 2;
        while (incrementNum >= 1) {
            for (int i = 0; i < array.length; i++) {
                //进行插入排序
                for (int j = i; j < array.length - incrementNum; j = j + incrementNum) {
                    if (array[j] > array[j + incrementNum]) {
                        int temple = array[j];
                        array[j] = array[j + incrementNum];
                        array[j + incrementNum] = temple;

                    }
                }
            }
            //设置新的增量
            incrementNum = incrementNum / 2;
        }
    }

    //由于需要频繁的操作和打印数组，先写一个数组打印的静态方法
    public static void printArray(int[] array) {
        System.out.print("{");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");
    }

    public static void main(String[] args) {
        int[] array = {67, 9, 2, 51, 3, 0, 12, 10};
        printArray(array);
        System.out.println();
        shell2Sort(array);
        printArray(array);
    }
}

