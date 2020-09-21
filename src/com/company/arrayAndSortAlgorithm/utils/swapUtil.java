package com.company.arrayAndSortAlgorithm.utils;

public class swapUtil {

    public static void swap(int[] array, int i, int j) {
        if (array[i] > array[j]) {
            int hold = array[i];
            array[i] = array[j];
            array[j] = hold;
        }
    }
}
