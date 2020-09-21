package com.company.arrayAndSortAlgorithm;

import com.company.arrayAndSortAlgorithm.utils.swapUtil;

public class BubbleSort {

    public static void sortArray(int[] array) {
        for (int sortOuterLoop = array.length-1; sortOuterLoop > 0; sortOuterLoop --) {
            for (int i = 0; i < sortOuterLoop; i ++) {
                swapUtil.swap(array, i, i+1);
            }
        }
    }


}
