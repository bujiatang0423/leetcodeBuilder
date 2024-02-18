package com.array;

import java.util.Arrays;

public class OnePlus {
    public static void main(String[] args) {
        int[] digits=new int[]{1,2,9};
        final int[] ints = plusOne(digits);
        System.out.println(Arrays.toString(ints));

    }

    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for (int i = len - 1; i >= 0; i--) {
            digits[i] = (digits[i] + 1) % 10;
            if (digits[i] != 0) {
                return digits;
            }
        }
        digits = new int[len + 1];
        digits[0] = 1;
        return digits;
    }
}
