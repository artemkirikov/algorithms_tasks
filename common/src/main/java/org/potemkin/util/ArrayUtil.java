package org.potemkin.util;

import java.util.Random;

public class ArrayUtil {
    private Random rm = new Random();

    /**
     * Метод создаёт случайную матрицу значений из 0 или 1
     *
     * @param sizeUp     - высота матрицы
     * @param sizeString - длина матрицы
     */
    public int[][] randomArray(int sizeUp, int sizeString) {
        int[][] array = new int[sizeUp][sizeString];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = rm.nextInt(2);
            }
        }
        return array;
    }

    /**
     * Метод меняет значение на противоположное
     */
    public int[][] changeArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 0) {
                    array[i][j] = 1;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        return array;
    }

    /**
     * Метод рисует в консоли матрицу
     *
     * @param array - матрица передаваемая в метод,
     *              представляет из себя двумерный массив
     */
    public void printArray(int array[][]) {
        for (int[] anArr : array) {
            for (int anAnArr : anArr) {
                System.out.print(anAnArr + " ");
            }
            System.out.println();
        }
    }
}
