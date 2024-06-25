package com.array;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ArrayApplicationTests {

    @Test
    void contextLoads() {

        final boolean perfectSquare = isPerfectSquare(14);
        System.out.println(perfectSquare);
        int i  = 202051;
        System.out.println(i*i);
    }


    public boolean isPerfectSquare(int num) {
        if (num == 0 || num == 1) return true;

        int left = 1;
        int right = num / 2;
        while (left<right){
            int mind = left + (right-left+1)/2;
            if (num / mind == mind && num % mind == 0){
                return true;
            }else if(mind>num/mind){
                 right = mind -1;
            }else{
                left = mind ;
            }

        }
        return false;
    }

    @Test
    public void guessNumber() {
        int target=1;
        int n = 3;
        int result = 1;
        for (int i = 1; i < n; ++i) {
            target+=i;
            if(target>n){
               result = i-1;
               break;
            }
        }
        System.out.println(result);
    }

    public  int guess(int nums){
        if (nums<2){
            return  1;
        }
        if (nums>2){
            return -1;
        }
        else  return  0;
    }

    @Test
    public void testCharLength(){
        char[] chars = new char[100];
        final int length = chars.length;
        System.out.println(length);
    }

}
