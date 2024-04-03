package com.arrayList;

public class binarySearch {
    public static void main(String[] args) {
            int nums[] = new int[]{-1,0,3,5,9,12};
            search(nums,2);
    }

    public  static  int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length;
        int mind = right/2;

        while (left<right){
            if (nums[mind]<target){
                left = mind;
            }else  if (nums[mind]>target){
                right = mind;
            }else {
                return mind;
            }
            mind=(right+left)/2;
        }

        return -1;
    }
}
