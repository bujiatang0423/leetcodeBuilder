package com.array;

import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

    /**
     * 我们维护一个候选众数 candidate 和它出现的次数 count。初始时 candidate 可以为任意值，count 为 0；
     *
     * 我们遍历数组 nums 中的所有元素，对于每个元素 x，在判断 x 之前，如果 count 的值为 0，我们先将 x 的值赋予 candidate，随后我们判断 x：
     *
     * 如果 x 与 candidate 相等，那么计数器 count 的值增加 1；
     *
     * 如果 x 与 candidate 不等，那么计数器 count 的值减少 1。
     */

    public static int majorityElement(int[] nums){
       int count=0;
       Integer candidate=null;
        for (int num:nums) {
            if(count==0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }
        return candidate;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,1,1,1,1,3,2,2,4,4,6,1,3,3};
        final int i = majorityElement(nums);
        System.out.println(i);
    }
}
