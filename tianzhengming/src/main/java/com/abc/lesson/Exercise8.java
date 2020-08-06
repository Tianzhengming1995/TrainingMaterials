package com.abc.lesson;

public class Exercise8 {
    public static void main(String[] args) {
        int[] arrays = new int[10];
        for (int i = 0; i < 10; i++) {
            arrays[i] = (int) (Math.random() * 100);
        }
        arrays = bubbleSort(arrays);
        for (int a : arrays)
            System.out.print(a + " ");
    }

    public static int[] bubbleSort(int[] arrays) {
        int n = arrays.length;
        boolean flag = false;
        for (int end = n; end > 0; end--) {
            for (int j = 0; j < end-1; j++) {
                if (arrays[j] > arrays[j + 1]) {
                    swap(arrays, j, j + 1);
                    flag = true;
                }
            }
            if (!flag)
                break;
        }
        return arrays;
    }

    public static void swap(int[] arrays, int i, int j) {
        int temp = arrays[i];
        arrays[i] = arrays[j];
        arrays[j] = temp;
    }
}
