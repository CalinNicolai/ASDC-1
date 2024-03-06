package org.example;

public class BinarySearch {
    public static int Search(int[] arr, int key) throws IllegalArgumentException {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) >>> 1;
            int midVal = arr[mid];

            if (midVal < key)
                low = mid + 1;
            else if (midVal > key)
                high = mid - 1;
            else
                return mid; // key found
        }
        throw new IllegalArgumentException("Элемент не найден в массиве");
    }
}
