package com.array;

public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int length = nums.length;
        int index = 0;
        if (length==0)
            return index;
        for (index = 0; index < length; index++) {
            if (nums[index]==target)
                return index;
            if (nums[index]>target)
                return index;
        }
        return length++;
    }
}
