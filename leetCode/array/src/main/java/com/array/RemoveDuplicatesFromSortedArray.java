package com.array;

import java.util.*;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        int[] nums = new int[]{-3,-1,0,0,0,3,3};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }


    /**
     * 用 hashMap 存放元素
     * 如果它不存在，就不处理。如果存在，就要又移动元素
     */

    public  static int removeDuplicates(int[] nums) {
        final Map<Integer, Integer> map = new HashMap<>();
        int k=0;
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])){
                nums[k]=nums[i];
                k++;
            }
            map.put(nums[i],i);
        }
        return k;
    }

    /**
     * 官方解
     */
    public  static int removeDuplicates2(int[] nums) {
        int length = nums.length;
        if (length==0) {
            return 0;
        }

        int low = 1;
        for (int fast = 1; fast <length ; fast++) {
            if (nums[fast]!=nums[fast-1]){
                nums[low]=nums[fast];
                low++;
            }
        }
        return low;
    }

}
