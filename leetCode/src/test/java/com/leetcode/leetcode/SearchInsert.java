package com.leetcode.leetcode;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;

@SpringBootTest
class SearchInsert {

    @Test
    public void searchInsert() {
        int[] nums = new int[10];
        int target=10;
        // 二分法
        int left = 0, right = nums.length - 1;
        while(left <= right){
            // 防止 left+right 整型溢出
            int mid = left + (right - left) / 2;
            if(nums[mid] == target){
                System.out.println(mid);
            }else if(nums[mid] < target){
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }
        }
        System.out.println(left);
    }



}

