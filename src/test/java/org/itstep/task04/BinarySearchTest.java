package org.itstep.task04;

import org.itstep.task04.Exeption.NotFoundException;
import org.itstep.task04.Exeption.SortingArrayException;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Random;

import static org.itstep.task04.Main.binarySearch;
import static org.junit.jupiter.api.Assertions.*;

public class BinarySearchTest {

    @Test
    public void checkNormalWork() {
        Random rnd = new Random();

        for (int z = 0; z < 30; z++) {

            int[] arr = new int[rnd.nextInt(25) + 2];

            arr[0] = 0;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i - 1] + rnd.nextInt(5);
            }

            int indexKey = rnd.nextInt(arr.length);
            int key = arr[indexKey];

            String s = "В массиве " + Arrays.toString(arr) + " и ключем " + key;
            try {
                Assert.assertEquals(s + "ключ " + key +" не найден/найден неверный", arr[binarySearch(arr, key)], key);
            } catch (SortingArrayException | NotFoundException e) {
                Assert.fail(s + " вызвано исключение " + e.getClass() + ", ожидалось " + indexKey);
            }

        }
    }

    @Test
    public void checkSortingArrayException() {
        Random rnd = new Random();

        for (int z = 0; z < 30; z++) {

            int[] arr = new int[rnd.nextInt(25) + 2];

            arr[0] = 0;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i - 1] + rnd.nextInt(5);
            }
            arr[rnd.nextInt(arr.length - 1)] += 11;

            int indexKey = rnd.nextInt(arr.length);
            int key = arr[indexKey];

            String s = "В массиве " + Arrays.toString(arr) + " и ключем " + key;
            try {
                binarySearch(arr, key);
            } catch (SortingArrayException | NotFoundException e) {
                Assert.assertTrue(s + " вызвано исключение " + e.getClass() + ", ожидалось SortingArrayException", e instanceof SortingArrayException);
                continue;
            }
            Assert.fail(s + " Ожидалось SortingArrayException, в действительности исключение не было.");

        }
    }

    @Test
    public void checkNotFoundException() {
        Random rnd = new Random();

        for (int z = 0; z < 30; z++) {

            int[] arr = new int[rnd.nextInt(25) + 2];

            arr[0] = 0;
            for (int i = 1; i < arr.length; i++) {
                arr[i] = arr[i - 1] + rnd.nextInt(5);
            }

            int key;
            boolean check;
            do {
                check = false;
                key = rnd.nextInt(arr[arr.length - 1] - arr[0] + 30) + arr[0];

                for (int i = 0; i < arr.length; i++) {
                    if (arr[i] == key){
                        check = true;
                        break;
                    }
                }
            }while (check);

            String s = "В массиве " + Arrays.toString(arr) + " и ключем " + key;
            try {
                Assert.fail(s + "ключ " + key +" не найден по индексу " + binarySearch(arr, key) + "Ожидалось NotFoundException");
            } catch (SortingArrayException | NotFoundException e) {
                Assert.assertTrue("Ожидалось NotFoundException, в действительности " + e.getClass(), e instanceof NotFoundException);
            }

        }

    }
}