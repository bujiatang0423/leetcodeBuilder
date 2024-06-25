package com.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = new int[]{-1,0,1,2,-1,-4};

        final List<List<Integer>> lists = threeSum(nums);
        System.out.println(lists.toString());
    }

        public static List<List<Integer>> threeSum(int[] nums) {

            Arrays.sort(nums);

            final ArrayList<List<Integer>> lists = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                int j = i+1;
                int k = nums.length-1;

                while (j<k){
                    if (nums[i]+nums[j]+nums[k]>0){
                        k--;
                    }else if (nums[i]+nums[j]+nums[k]<0){
                        j++;
                    }else{
                        final ArrayList<Integer> integers = new ArrayList<>();
                        integers.add(nums[i]);
                        integers.add(nums[j]);
                        integers.add(nums[k]);
                        lists.add(integers);
                        j++;
                        k--;
                    }
                }
            }
            final Stream<List<Integer>> distinct = lists.stream().distinct();
            final List<List<Integer>> collect = distinct.collect(Collectors.toList());
            return collect;

        }

}
