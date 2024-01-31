package com.example.algotithms.sort;

import java.util.Arrays;

/**
 * 插入排序
 * 当使用插入排序时
 * 数组被分为已排序部分和未排序部分。
 * 在每一步中，从未排序部分选择一个元素，
 * 并将其插入到已排序部分的适当位置，
 * 以保持已排序部分的有序性。
 * 以下是用Java实现插入排序的简单示例代码：
 * @param <T>
 */

/**
 * 插入排序即遍历数组
 * 将每个大于当前i索引处 key 元素的值后移
 * @param <T>
 */
public class InsertionSort <T extends Comparable<T>> {

    public static void main(String[] args) {

        Integer[] array = new Integer[]{3,5,2,7};
        InsertionSort<Integer> intSorter = new InsertionSort<>();
        intSorter.insertionSort(array);
        System.out.println(Arrays.toString(array));
    }


    public  void insertionSort(T[] array) {
        int n = array.length;
        for (int i = 1; i < n; ++i) {
            T key = array[i];
            int j = i - 1;

            // 将array[0..i-1]中比key大的元素移动到右边
            while (j >= 0 && array[j].compareTo(key)>0) {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
    }

}
