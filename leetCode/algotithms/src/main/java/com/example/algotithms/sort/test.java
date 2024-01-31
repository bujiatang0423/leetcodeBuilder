package com.example.algotithms.sort;

public class test {
    public static void main(String[] args) {
        int[] array = {7,5,6,8,3};

        System.out.println("原始数组：");
        printArray(array);

        shellSort(array);

        System.out.println("\n排序后数组：");
        printArray(array);
    }

    // 希尔排序实现
    public static void shellSort(int[] array) {
        int n = array.length;

        // 初始步长设置为数组长度的一半，然后逐步减半
        for (int gap = n / 2; gap > 0; gap /= 2) {
            // 使用插入排序对每个步长的元素进行排序
            for (int i = gap; i < n; i++) {
                int temp = array[i];
                int j;

                for (j = i; j >= gap && array[j - gap] > temp; j -= gap) {
                    array[j] = array[j - gap];
                }

                array[j] = temp;
            }
        }
    }

    // 打印数组元素
    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
    }

}
