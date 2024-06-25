package com.array;

public class Merge_Sorted_Array {

    /**
     * 冒泡排序时间复杂度过高
     * 为O(n^2)
     */
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


    /**
     *改进思路 创建中间数组，
     * 利用 nums1 和 nums2 局部有序的方式
     * 依次比较大小放入中间数组中
     */
    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int[] sort = new int[m+n];
        int p1 = 0;
        int p2 =0;
        int cur=0;
        while (p1<m||p2<n) {
            if (p1==m){
                cur=nums2[p2++];
            }else if (p2==n){
                cur=nums1[p1++];
            }else if (nums1[p1]<=nums2[p2]){
                cur = nums1[p1++];
            }else if(nums1[p1]>nums2[p2]){
                cur = nums2[p2++];
            }
            sort[p1+p2-1]=cur;
        }

        for (int i = 0; i < sort.length; i++) {
            nums1[i]=sort[i];
        }
    }




    /**
     * 逆序双指针
     * 利用 nums1 和 nums2 局部有序的方式
     * 将比较大的元素放入末尾，同时指针前移
     */
    public void merge3(int[] nums1, int m, int[] nums2, int n) {
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
