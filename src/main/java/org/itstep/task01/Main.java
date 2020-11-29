package org.itstep.task01;

import org.itstep.task01.Exception.ListException;

public class Main {
    public static final int SIZE = 3;
    public static void main(String[] args) {
        List list = new List(SIZE);

        System.out.println("Размер массива " + SIZE + " попробуем добавить в него " + (SIZE + 1) + " элементов");
        System.out.println(SIZE + 1 + " элемент вызовет исключение FullListException");
        for (int i = 0; i < SIZE + 1; i++) {
            try {
                list.add(i);
                System.out.println((i + 1) + " элемент успешно добавлен.");
            } catch (ListException e) {
                System.out.println((i + 1) + " элемент при добавлении вызвал исключение.");
                //e.printStackTrace();
            }
        }

        System.out.println("Заполненый массив размером " + SIZE + " попробуем убрать из него " + (SIZE + 1) + " элементов");
        System.out.println("0 элемент вызовет исключение EmptyListException");
        for (int i = 0; i < 4; i++) {
            try {
                list.removeLast();
                System.out.println((3 - i) + " элемент успешно уделен.");
            } catch (ListException e) {
                System.out.println((3 - i) + " элемент при уделении вызвал исключение.");
                //e.printStackTrace();
            }
        }

        //Проверяем что программа завершила свою работу корректно
        System.out.println("Корректное завершение работы программы с обработкой всех исключений в коде");
    }
}
