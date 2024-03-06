package org.example;

public class Main {
    public static void main(String[] args) {
        int length = 10000000;
        int[] PrimeArray = new int[length];
        for (int i = 0; i < PrimeArray.length; i++) {
            PrimeArray[i] = (int) (Math.random() * 10000);
        }
        int[] arr = PrimeArray.clone();
        long startTime = System.currentTimeMillis();
        QuickSort.Sort(arr);
        long endTime = System.currentTimeMillis();
        System.out.println("QuickSort время выполнения: " + (endTime - startTime) + " мс");
        arr = PrimeArray.clone();
        startTime = System.currentTimeMillis();
        MergeSort.Sort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("MergeSort время выполнения: " + (endTime - startTime) + " мс");
        arr = PrimeArray.clone();
        startTime = System.currentTimeMillis();
        int[] SortedArray = HeapSort.Sort(arr);
        endTime = System.currentTimeMillis();
        System.out.println("HeapSort время выполнения: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        try {
            int IndexElementOfSearch = BinarySearch.Search(SortedArray, 1275);
            System.out.println("Индекс найденного элемента: " + IndexElementOfSearch);
        } catch (IllegalArgumentException e) {
            System.out.println("Элемент не найден в массиве.");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Бинарный поиск время выполнения: " + (endTime - startTime) + " мс");

        startTime = System.currentTimeMillis();
        try {
            int IndexElementOfSearch = LinearSearch.Search(PrimeArray, 18);
            System.out.println("Индекс найденного элемента: " + IndexElementOfSearch);
        } catch (IllegalArgumentException e) {
            System.out.println("Элемент не найден в массиве.");
        }
        endTime = System.currentTimeMillis();
        System.out.println("Линейный поиск время выполнения: " + (endTime - startTime) + " мс");

        for (int i = 0; i < 2000; i++) {
            System.out.print(SortedArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < 2000; i++) {
            System.out.print(PrimeArray[i] + " ");
        }
    }
}
