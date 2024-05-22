package org.example;

import java.util.Arrays;

/**
 * Сортировка вставками
 * Элементы входной последовательности просматриваются по одному, и каждый новый поступивший элемент размещается в
 * подходящее место среди ранее упорядоченных элементов. Данная сортировка является устойчивой (одинаковые элементы не
 * изменят свой порядок) в отличие от сортировки выбором.
 * Временная сложность: O(n^2).
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {15, 16, 4, 8, 23, 42};
        insertionSort(array);
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while (j >= 0 && current < array[j]) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = current;
        }
        System.out.println(Arrays.toString(array));
    }
}
