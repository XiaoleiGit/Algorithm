package com.company.arrayAndSortAlgorithm;

public class QuickSort {
    public static void sortArray(int[] array, int start, int end) {
        if (end - start < 2) {
            return;
        }

        // what will be the index of the pivot after sort finished
        int pivotIndex = partion(array, start, end);

        sortArray(array, start, pivotIndex);
        sortArray(array, pivotIndex+1, end);
    }

    // This is using the 1st element of the array as the pivot
    public static int partion(int[] array, int start, int end) {
        int pivot = array[start];
        int i = start;
        int j = end;

        while (i < j) {
            // Find the index j where the value is less then the pivot
            while (i < j && array[--j] >= pivot);
            // Copy the value of index j to i position
            if (i < j) {
                array[i] = array[j];
            }
            // Find the index i where the value is larger then the pivot
            while(i < j && array[++i] <= pivot);
            if (i < j) {
                array[j] = array[i];
            }
        }
        array[j] = pivot;
        return j;
    }
}
