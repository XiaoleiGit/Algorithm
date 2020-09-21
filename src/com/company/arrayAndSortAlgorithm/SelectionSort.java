package com.company.arrayAndSortAlgorithm;

import com.company.arrayAndSortAlgorithm.utils.swapUtil;

public class SelectionSort {

    public static void sortArray(int[] array) {

        for (int index = array.length - 1; index > 0; index --) {
            int largestValueIndex = 0;
            for (int i = 1; i <= index; i ++) {
                if (array[largestValueIndex] < array[i]) {
                    largestValueIndex = i;
                }
            }
            swapUtil.swap(array, largestValueIndex, index);
        }
    }

}
