package com.example.algotithms.sort;

import java.util.Arrays;

/**
 * @author bujiatang
 * 思想是
 * 每次遍历数组选择一个最小的放在索引位置上 
 */
public class SelectionSort<T extends Comparable<T>> {

    public static void main(String[] args) {
        Integer[] array = new Integer[]{1,5,23,7,2};
        SelectionSort<Integer> intSorter = new SelectionSort<>();
        intSorter.sort(array);
        System.out.println(Arrays.toString(array));


        String[] strings = new String[]{"h","w","a","e","t","y"};
        SelectionSort<String> stringSelectionSort = new SelectionSort<>();
        stringSelectionSort.sort(strings);
        System.out.println(Arrays.toString(strings));
        
    }
    
    public void sort(T[] array){
        int length  = array.length;
        for (int i = 0; i < length; i++) {
            int min = i;

            //找出最小元素的索引位置
            for (int j = i+1; j < length; j++) {
                if (array[j].compareTo(array[min])<0) {
                    min =j;
                }

                //交换第i位和最小元素的位置
                T k = array[min];
                array[min] = array[i];
                array[i] = k;
            }
        }
    }
    
}
