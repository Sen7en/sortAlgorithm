package com.xiang.gao.sort;

import java.util.Arrays;

/**
 * divide and conquer(归并排序)
 *
 * @author Administrator
 * @crdate 2017-10-10 14:22
 */
public class MergeSort {


    public static int[] sort(int[] nums, int low, int high) {
        int mid = low + (high - low) / 2;
        if (low < high) {
            //左边
            sort(nums, low, mid);
            //右边
            sort(nums, mid + 1, high);
            //左右归并
            merge(nums, low, mid, high);
        }
        return nums;
    }

    public static void merge(int[] nums, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        //左指针
        int i = low;
        //右指针
        int j = mid + 1;
        int k = 0;

        //把较小的数先移到新数组中
        while (i <= mid && j <= high) {
            if (nums[i] < nums[j]) {
                temp[k++] = nums[i++];
            } else {
                temp[k++] = nums[j++];
            }
        }
        //把左边剩余的数移入数组
        while (i <= mid) {
            temp[k++] = nums[i++];
        }

        //把右边剩余的数移入数组
        while (j <= high) {
            temp[k++] = nums[j++];
        }

        //把新组中的数覆盖nums数组
        for (int k2 = 0; k2 < temp.length; k2++) {
            nums[k2 + low] = temp[k2];
        }
    }

    public static void main(String[] args) {

        int[] nums = {5, 3, 2, -1};
        String s = "staticFactory";
        MergeSort.sort(nums, 0, nums.length - 1);
        System.out.println(Arrays.toString(nums));
    }

}
