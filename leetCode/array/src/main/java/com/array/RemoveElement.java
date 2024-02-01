package com.array;

public class RemoveElement {

    /**
     *解决思路 双指针
     */
    public int removeElement(int[] nums, int val) {
        int length = nums.length;
        int low = 0;
        for (int i = 0; i < length; i++) {
            if (nums[i]!=val){
                nums[low++]=nums[i];
            }
        }
        return low;
    }
}
