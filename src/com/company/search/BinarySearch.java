package com.company.search;

public class BinarySearch {

    // {-12, -3, 5, 20, 100} search 20
    public static int binarySearch(int[] array, int value) {
        int start = 0;
        int end = array.length - 1;

        while (start < end) {
            int mid = (start + end)/2;
            System.out.println("mid point: "+mid);
            if (array[mid] == value) {
                return mid;
            } else if (array[mid] < value) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return -1;
    }

    // {-12, -3, 5, 20, 100} search 20
    public static int recursionBinarySearch(int[] array, int value, int start, int end) {
        if (start >= end) {
            return -1;
        }
        int mid = (start + end)/2;
        if (array[mid] == value) {
            return mid;
        } else if (array[mid] < value) {
            return recursionBinarySearch(array, value, mid + 1, end);
        } else {
            return recursionBinarySearch(array, value, start, mid);
        }
    }


}
