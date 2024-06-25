package com.array;

import java.util.Arrays;

public class SortColors {

    public static void main(String[] args) {
       int[] nums =  new int[]{2,2,0,1};
       sortColors(nums);
    }


    public  static void sortColors(int[] nums) {
        int n0 = 0, n1 = 0;
        for(int i = 0; i < nums.length; i++){
            int num = nums[i];
            nums[i] = 2;
            if(num < 2){
                nums[n1++] = 1;
            }
            if(num < 1){
                nums[n0++] = 0;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

}
