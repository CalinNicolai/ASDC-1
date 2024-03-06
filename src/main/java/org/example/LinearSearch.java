    package org.example;

    public class LinearSearch {
        public static int Search(int[] array, int key) throws IllegalArgumentException {
            for (int i = 0; i < array.length; i++) {
                if (array[i] == key) {
                    return i;
                }
            }
            throw new IllegalArgumentException("Элемент не найден в массиве");
        }

    }
