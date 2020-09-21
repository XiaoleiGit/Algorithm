package com.company.arrayAndSortAlgorithm;

public class InsertionSort {

    public static void sortArray(int[] array) {

        for (int index = 1; index < array.length; index ++) {

            int unsortedValue = array[index];

            int sortedIndex;
            for (sortedIndex = index - 1; sortedIndex >= 0 && array[sortedIndex] > unsortedValue; sortedIndex --) {
                array[sortedIndex+1] = array[sortedIndex];
            }

            array[sortedIndex+1] = unsortedValue;
        }
    }

    public static void sortRecursion(int[] array, int numItems) {

        if (numItems < 2) {
            return;
        }

        sortRecursion(array, numItems-1);

        int unsortedValue = array[numItems-1];
        int sortedIndex;
        for (sortedIndex = numItems - 1 - 1; sortedIndex >= 0 && array[sortedIndex] > unsortedValue; sortedIndex --) {
            array[sortedIndex+1] = array[sortedIndex];
        }
        array[sortedIndex+1] = unsortedValue;

    }
}
