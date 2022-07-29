package com.cgj.test1;

import java.util.Arrays;

/**
 * @Description 冒泡排序算法
 *
 **/
public class SortTest {

    public static void main(String[] args) {

        int[] arr = {66, 2, 8, 4, 34};//创建数组

        System.out.println("排序前");
        System.out.println(Arrays.toString(arr));

        //循环实现冒泡排序
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {

                int temp = 0;
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }

        }
        System.out.println("排序后");
        System.out.println(Arrays.toString(arr));

    }

}
