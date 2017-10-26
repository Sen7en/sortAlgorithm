package com.xiang.gao.sort;

/**
 * 插入排序
 *
 * @author mubai
 * @crdate 2017-09-28 15:32
 */
public class InsertSort {

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

    /**
     * 插入排序的核心是拿数组中所有的元素跟数据中已经排序好的元素进行对比，如果选择的元素比已排序的元素小就进行交换直到
     * 与所有元素比较完成。
     *
     * @param arrays
     * @return
     */
    public static void insertSortMethod(int[] arrays) {

        //例：[9,3]
        if (arrays == null || arrays.length < 2) {
            return;
        }
        //从第二个数开始比，遍历所有待循环数组
        for (int i = 1; i < arrays.length; i++) {
            //当前值
            Integer currentValue = arrays[i];
            //当前的下标
            Integer position = i;
            for (int y = i - 1; y >= 0; y--) {
                //用当前值跟前面已排序好的元素进行对比
                if (arrays[y] > currentValue) {
                    //与前一个值进行替换
                    arrays[y + 1] = arrays[y];
                    //下标-1继续对比
                    position -= 1;
                }
            }
            //对比结束，positon的值就是要当前值要换到的地方
            arrays[position] = currentValue;
        }

    }

    public static void main(String[] args) {
        int[] array = {5, 2, 9, 3, 23, 21};
        printArray(array);
        insertSortMethod(array);
        System.out.println();
        printArray(array);
    }


}
