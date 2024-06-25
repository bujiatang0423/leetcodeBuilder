package com.arrayList;

public class LeetCode69 {
    public int mySqrt(int x) {

        int left = 0;
        int right = x;
        int target=0;

        while(left<right){
            int mind = (right-left)/2;
            if (mind*mind > x){
                right = mind-1;
            }else{
                target=mind;
                left = mind+1;
            }
        }
        return target;
    }
}
