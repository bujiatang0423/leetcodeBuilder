package com.array;

import org.yaml.snakeyaml.util.ArrayUtils;

public class Merge_Sorted_Array {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
            if(m==0){
                System.arraycopy(nums2,0,nums1,0,nums2.length);
            }else if (m>0&&n>0) {
                for (int i = 0; i < n; i++) {
                    nums1[i+m]=nums2[i];
                }
                for (int i = 0; i < (n + m); i++) {
                    for (int j = i+1; j < (n+m); j++) {
                        if (nums1[i]>nums1[j]){
                            int k = nums1[i];
                            nums1[i]=nums1[j];
                            nums1[j]=k;
                        }
                    }
                }
            }
    }
}
