package com.xiang.gao.reverse;

import org.apache.commons.lang3.ArrayUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * 反转数组
 *
 * @author Administrator
 * @crdate 2017-12-11 14:36
 */
public class ReverseDemo {
    public static void main(String[] args) {
        customMethod();
    }

    //集合方法
    public static void collectionMethod() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("A");
        arrayList.add("B");
        arrayList.add("C");
        arrayList.add("D");
        arrayList.add("E");
        System.out.println("反转前：" + arrayList);
        Collections.reverse(arrayList);
        System.out.println("反转后：" + arrayList);
    }

    //数组方法
    public static void arrayMethod() {
        String[] arrays = {"1", "2", "3", "4"};
        System.out.println("转换前" + Arrays.toString(arrays));
        ArrayUtils.reverse(arrays);
        System.out.println("转换后" + Arrays.toString(arrays));
    }

    //自己写的反转方法
    public static void customMethod() {
        String[] array = {"1", "2", "3", "4", "5"};
        System.out.println("转换前" + Arrays.toString(array));
        int i = 0;
        int j = array.length - 1;
        String tmp;
        while (j > i) {
            tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
            j--;
            i++;
        }
        System.out.println("转换后" + Arrays.toString(array));

    }

    //打印数组方法
    public static String printArray(Object[] array) {

        if (array == null) {
            return null;
        }
        int iMax = array.length - 1;
        if (iMax == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; ; i++) {
            sb.append(String.valueOf(array[i]));
            if (i == iMax) {

                return sb.append("]").toString();
            }
            sb.append(",");
        }
    }


}
