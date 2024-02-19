package com.array;

/**
 * 1.31号一刷
 *
 *
 *题目描述
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素在答案里不能重复出现。
 * 你可以按任意顺序返回答案。
 * 示例 1：
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 *
 * 示例 2：
 * 输入：nums = [3,2,4], target = 6
 * 输出：[1,2]
 * 示例 3：
 *
 * 输入：nums = [3,3], target = 6
 * 输出：[0,1]
 *
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 思路分析 遍历：若a[i]+a[j] = temp 则返回 i ， j 时间复杂度为O(N^2)
 */
public class TwoSum {
    public static void main(String[] args) {

    }


    /**
     * 双循环，时间复杂度为 O(n^2)
     */
    public int[] twoSum(int[] nums, int target) {
        final int[] integers = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                    integers[0]=i;
                    integers[1]=j;
                }
            }
        }
        return integers;
    }


    /**
     * 使用哈希表，获取到索引处元素后 判断 hash 表中是否存在该元素 的 target - key 值
     * 若存在，返回 索引处位置 和 hash 表中的 key，否则 放入索引处元素
     */
    public int[] twoSum2(int[] nums, int target) {
        final Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])){
                return new int[]{i,map.get(target-nums[i])};
            }
            map.put(nums[i],i);
        }

        return new int[0];
    }
}
