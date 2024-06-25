package com.arrayList;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Test {

    public static void main(String[] args) {
        int[] arr = new int[]{1,0,3,5,0};
        moveZeroes(arr);
        System.out.println(Arrays.toString(arr));

    }

    public static int nextGreatestLetter(int[] arr) {
        int left = 0;
        int right = arr.length-1;

        while(left<right){
            int mind = left + (right-left)/2;
            if(arr[mind]<arr[mind+1]){
                left = mind+1;
            }else
                right = mind;
        }
        return right;
    }

    public static int specialArray(int[] nums) {
        int i = 0;
        int length=1;
        int count = 0;
        for (i = 0; i < nums.length; i++) {
            if(nums[i]>length){
                count++;
            }
        }


        return -1;
    }

    public  static void moveZeroes(int[] nums) {
        int left  = 0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==0){
                left = i;
            }else {
                nums[left] = nums[i];
                nums[i]=0;
                left++;
            }

        }

    }



}
