package org.example;

import java.util.Arrays;

/**
 * Сортировка выбором
 * Каждый проход алгоритм выбирает наименьший элемент и смещает его в начало. Далее сортирует хвост списка, исключив из
 * рассмотрения уже отсортированные элементы.
 * Временная сложность: O(n^2).
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {15, 16, 4, 8, 23, 42};
        selectionSort(array);
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
        System.out.println(Arrays.toString(array));
    }
}
