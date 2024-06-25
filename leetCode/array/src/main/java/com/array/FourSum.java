package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FourSum {

    public static void main(String[] args) {

        final int[] ints = {1000000000, 1000000000, 1000000000, 1000000000};

        final List<List<Integer>> lists = fourSum(ints, -294967296);
        lists.forEach(System.out::println);
    }


    public static List<List<Integer>> fourSum(int[] nums, int target) {

        Arrays.sort(nums);
        List<List<Integer>> list  = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int i1 = i+1;i1< nums.length;i1++) {
                int left = i1+1;
                int right = nums.length-1;

                while (left<right){
                    final long num = (long) nums[i]+ (long) nums[i1] + (long) nums[left] + (long) nums[right];
                    if (num==target){
                        final List<Integer> list1 = Arrays.asList(nums[i], nums[i1], nums[left], nums[right]);
                        list.add(list1);
                    }
                    if(num<target){
                        left++;
                    }else {
                        right--;
                    }
                }
            }
        }
        final List<List<Integer>> collect = list.stream().distinct().collect(Collectors.toList());

        return collect;

    }
}
