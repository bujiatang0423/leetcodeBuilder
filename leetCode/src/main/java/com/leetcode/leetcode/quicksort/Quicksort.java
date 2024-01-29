package com.leetcode.leetcode.quicksort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 * 快速排序
 * 用的是递归的方式
 * 将数组不断的拆分成小模块
 * 将小模块进行排序，最后数组为 左模块 + 中间值 + 右模块
 */
public class Quicksort {


    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(1,5,2,6,9,2,3,11));
        final List<Integer> integers = quickSort(arrayList);
        integers.forEach(System.out::print);
    }

    public static List<Integer> quickSort(List<Integer> arrayList){


        if (arrayList.size()<2) {
            return arrayList;
        }

        int pivot = arrayList.get(arrayList.size()/2);
        int pivotIndex = arrayList.size()/2;
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i++) {
            if (i==pivotIndex){
                continue;
            }
            if (arrayList.get(i)<=pivot){
                left.add(arrayList.get(i));
            }else {
                right.add(arrayList.get(i));
            }
        }

        quickSort(left);
        quickSort(right);

        arrayList.clear();

        arrayList.addAll(left);
        arrayList.add(pivot);
        arrayList.addAll(right);

        return arrayList;
    }

}
