package com.example.algotithms.sort;


import java.util.Arrays;

public class ShellSort <T extends Comparable<T>>{


    public static void main(String[] args) {

        Integer[] array = new Integer[]{3,5,2,7};
        ShellSort<Integer> intSorter = new ShellSort<>();
        intSorter.shellSort(array);
        System.out.println(Arrays.toString(array));
    }


    public  void shellSort(T[] array) {
        int length = array.length;

        //将数组分组
        //每次二分
        for (int gap = length / 2; gap > 0 ; gap /= 2) {

            for (int i = gap; i < length; i++){
                //记录当前索引位置元素
                T temp  = array[i];
                int j;
                for (j = i; j>=gap && array[j-gap].compareTo(temp) > 0; j -= gap) {
                        array[j] = array[j - gap];
                }
                array[j] = temp;
            }

        }
    }

}
