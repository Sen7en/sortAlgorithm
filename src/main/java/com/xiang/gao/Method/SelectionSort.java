package com.xiang.gao.Method;

/**
 * 选择排序
 *
 * @author Administrator
 * @crdate 2017-10-09 17:25
 */
public class SelectionSort {

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 45, 65, 33, 12};
        System.out.println("交换之前：");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        for (int i = 0; i < arr.length - 1; i++) {
            int k = i;
            //选择最小的
            for (int j = k + 1; j < arr.length; j++) {
                if (arr[j] < arr[k]) {
                    //记下目标最小值的角标
                    k = j;
                }
            }
            //内循环结束，找到了本次循环内最小的值,进行交换
            if (i != k) {
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }
        }
        System.out.println();
        System.out.println("交换后：");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

}
