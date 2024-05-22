package org.example;

import java.util.Arrays;

/**
 * Сортировка пузырьком
 * Алгоритм просматривает массив и сравнивает каждую пару соседних элементов. Когда он встречает пару элементов,
 * расположенных не по порядку, происходит замена двух элементов местами.
 * Так как мы используем цикл в цикле, сложность нашего алгоритма увеличивается. При n элементах временная сложность
 * будет n * n, то есть O(n^2). Такая сложность называется квадратичной.
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {15, 16, 4, 8, 23, 42};
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array) {
        boolean needIteration = true;
        int temp;
        while (needIteration) {
            needIteration = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    needIteration = true;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
