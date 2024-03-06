package org.example;
public class MergeSort {
    public static void Sort(int[] array) {
        if (array == null) {
            return;
        }
        if (array.length > 1) {
            int mid = array.length / 2;

            int[] leftArray = new int[mid];
            for (int i = 0; i < mid; i++) {
                leftArray[i] = array[i];
            }

            int[] rightArray = new int[array.length - mid];
            for (int i = mid; i < array.length; i++) {
                rightArray[i - mid] = array[i];
            }

            Sort(leftArray);
            Sort(rightArray);

            merge(array, leftArray, rightArray);
        }
    }

    private static void merge(int[] array, int[] leftArray, int[] rightArray) {
        int i = 0, j = 0, k = 0;
        while (i < leftArray.length && j < rightArray.length) {
            if (leftArray[i] < rightArray[j]) {
                array[k++] = leftArray[i++];
            } else {
                array[k++] = rightArray[j++];
            }
        }
        while (i < leftArray.length) {
            array[k++] = leftArray[i++];
        }
        while (j < rightArray.length) {
            array[k++] = rightArray[j++];
        }
    }
}
