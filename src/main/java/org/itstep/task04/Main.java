package org.itstep.task04;

import org.itstep.task04.Exeption.NotFoundException;
import org.itstep.task04.Exeption.SortingArrayException;

public class Main {
    public static void main(String[] args) {
        // TODO: проверяйте ваш код здесь
    }

    public static int binarySearch(int[] arr, int key) throws SortingArrayException, NotFoundException {

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                throw new SortingArrayException("Массив не отсортирован");
            }
        }

        int num = binarySearch(arr, key, 0, arr.length - 1);

        if (num == -1){
            throw new NotFoundException("Элемент не найден");
        }

        return num;
    }

    private static int binarySearch(int[] arr, int key, int indexLow, int indexHigh) {

        if (indexLow > indexHigh){
            return -1;
        }

        int index = (indexHigh + indexLow) / 2;
        if (key < arr[index]) {
            return binarySearch(arr, key, indexLow, index - 1);
        }
        if (key > arr[index]) {
            return binarySearch(arr, key, index + 1, indexHigh);
        }
        return index;
    }
}
