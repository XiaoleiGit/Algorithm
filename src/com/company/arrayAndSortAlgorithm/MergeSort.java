package com.company.arrayAndSortAlgorithm;

public class MergeSort {

    public static void sortArray(int[] array, int start, int end) {
        // end = array.length   so end is 1 greater then the end index
        // start = 0
        // If array is a 1-element array, then return
        if (end - start < 2) {
            return;
        }

        // For array that is not 1-element array: Partition the array that we passed. The work is to figure out
        // where is the partition point
        int mid = (start + end)/2;
        // Partition parts index are: 0 to mid-1; mid to array.length-1
        sortArray(array, start, mid);
        sortArray(array, mid, end);

        merge(array, start, mid, end);

    }

    public static void merge(int[] array, int start, int mid, int end) {
        // array[mid] is the 1st element in the right partition.
        // If the 1st element in right is greater the last element of left, then no need to merge,
        // because the order is sorted.
        if (array[mid-1] <= array[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        // To track where we are during copy
        int tempIndex = 0;

        int[] temp = new int[end - start];

        while (i < mid && j < end) {
            temp[tempIndex++] = array[i] <= array[j] ? array[i++] : array[j++];
        }

        // Copy the unsorted left array back to original array
        // arraycopy(source array, start position, destination array, )
        System.arraycopy(array, i, array, start + tempIndex, mid - i);

        // Copy the sorted tempArray back to original array
        System.arraycopy(temp, 0, array, start, tempIndex);
    }
}
