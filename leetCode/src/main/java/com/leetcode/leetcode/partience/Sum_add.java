package com.leetcode.leetcode.partience;


import java.util.*;

/**
 * @author bujiatang
 */
public class Sum_add {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        final Integer integer = sumAdd(arrayList,0);
        System.out.println(integer);

    }


    public  static Integer sumAdd(List<Integer> sums,int index){
        if (index>=sums.size()){
            return 0;
        }else{
            return sums.get(index)+sumAdd(sums,index+1);
        }
    }

}
