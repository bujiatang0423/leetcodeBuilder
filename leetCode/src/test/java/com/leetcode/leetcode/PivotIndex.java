package com.leetcode.leetcode;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Arrays;

//寻找数组中心索引

/**
 * 寻找数组中心索引
 * <p>
 * 给你一个整数数组 nums ，请计算数组的 中心下标 。
 *<p>
 * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * <p>
 * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
 * <p>
 * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
 *
 */

@SpringBootTest
class PivotIndex {

    /**
     * 第一种解法，使用双循环，时间复杂度 O(N^2)
     */
    @Test
    public void pivotIndex_1() {
        int[] nums = new int[]{-1,-1,-1,-1,-1,1};
        int conunt =0;
        int sum =0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1;j<nums.length;j++){
                conunt+=nums[j];
            }
            for (int k = i-1;k> -1;k--){
                sum+=nums[k];
            }
            if (sum==conunt){
                System.out.println(i);

            }
            conunt=0;
            sum=0;
        }
        System.out.println(-1);
    }


    /**
     * 每加一个元素，把这个相加的结果保存下来
     * 如果最后的结果 - nums[i] 的值等于保存的结果
     * 返回i
     *
     */
    @Test
    public void pivotIndex_2() {
        int[] nums = new int[]{2,1,-1};
        int conunt =0;
        int sum =0;
        for (int i=0;i < nums.length; i++) {
            sum+=nums[i];
        }

        for (int j=0;j<nums.length;j++){
            if (conunt*2==sum-nums[j]){
                System.out.println(j);
            }
            //要将加等放在 for 循环后边，不然会先计算 += 的结果再比较，就错了。
            conunt+=nums[j];
        }

    }

    /**
     * 优化代码 提升可读性 与 精简部分代码
     */

    @Test
    public int pivotIndex_3() {
        int[] nums = new int[]{2,1,-1};
        int sum_left =0;
        int sum_right =0;
        sum_right= Arrays.stream(nums).sum();
        for (int j=0;j<nums.length;j++){
            if (sum_left*2==sum_right-nums[j]){
                return j;
            }
            //要将加等放在 for 循环后边，不然会先计算 += 的结果再比较，就错了。
            sum_left+=nums[j];
        }
        return -1;
    }


}
