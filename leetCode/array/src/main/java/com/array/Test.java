package com.array;

import java.util.Arrays;

public class Test {
    public static void main(String[] args) {
        int [] nums1 = new int[]{0};

        int [] nums2 = new int[]{1};
        System.out.println(Arrays.toString(nums1));
        merge3(nums1,0,nums2,1);
        System.out.println(Arrays.toString(nums1));
    }
    public  static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] sort = new int[m + n];
        int p1 = 0;
        int p2 = 0;
        int cur = 0;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] <= nums2[p2]) {
                cur = nums1[p1++];
            } else if (nums1[p1] > nums2[p2]) {
                cur = nums2[p2++];
            }
            sort[p1 + p2 - 1] = cur;
        }

        for (int i = 0; i < sort.length; i++) {
            nums1[i] = sort[i];
        }
    }


        public static void merge3(int[] nums1, int m, int[] nums2, int n) {
            int p1 = m-1;
            int p2 = n-1;
            int cur = 0;
            while (p1>=0||p2>=0) {
                if (p1==-1){
                    cur = nums2[p2--];
                }else if (p2==-1){
                    cur = nums1[p1--];
                }else if (nums1[p1]>=nums2[p2]){
                    cur=nums1[p1--];
                }else if (nums2[p2]>nums1[p1]){
                    cur=nums2[p2--];
                }
                nums1[p1+p2+2]=cur;
            }
        }
}
