package com.array;

public class RemoveElement {

    /**
     *解决思路 双指针
     * 时间复杂度为 O(N)
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

    /**
     * 优化思路
     * 时间复杂度为 O（logN）
     * 递归 二分查找
     */
    public int removeElement2(int[] nums, int val) {
        int length = nums.length;
        int ans = length;
        int left = 0;
        int right = length - 1;
        while (left<=right){
            int mid = ((right-left)>>1)+left;
            if (val<=nums[mid]){
                ans=mid;
                right = mid-1;
            }else {
                left = mid+1;
            }
        }
        return ans;
    }


}
