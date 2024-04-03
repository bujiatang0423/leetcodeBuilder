package com.arrayList;

public class LeetCode34 {

    public static void main(String[] args) {


    }


    public int[] searchRange(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int index = 0;
        while (left<right){
            int mind = left+right/2;
            if (nums[mind]<target){
                left=mind+1;
            }else if (nums[mind]>target){
                right=mind;
            }else{
                index = mind;
            }
        }
        

        return new int[]{-1,-1};
    }
}
