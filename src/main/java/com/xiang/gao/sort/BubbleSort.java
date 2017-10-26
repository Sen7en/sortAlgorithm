package com.xiang.gao.sort;

/**
 * 冒泡排序
 *
 * @author Administrator
 * @crdate 2017-10-10 9:45
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 1, 0, 5, 4, 7, 12, 11};
        System.out.println("排序前数组为：");
        for (int num : array) {
            System.out.print(num + " ");
        }
        //进行n-1轮排序
        for (int i = 0; i < array.length - 1; i++) {
            //每一轮会排序多少次
            for (int j = 0; j < array.length - i - 1; j++) {
                //前面的数大于后面的数，把2个数进行替换
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println();
        System.out.println("排序后的数组为： ");
        for (int num : array) {
            System.out.print(num + " ");
        }
    }
}
