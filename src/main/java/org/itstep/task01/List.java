package org.itstep.task01;

import org.itstep.task01.Exception.EmptyListException;
import org.itstep.task01.Exception.FullListException;

public class List {
    private Object[] obj;
    private int size = -1;
    private int cur = -1;

    public List(int size) {
        cur = 0;
        this.size = size;
        obj = new Object[size];
    }
   
    public Object get(int idx) {
        return obj[idx];
    }

    public void add(Object item) throws FullListException {
        /*add() на тот случай, если массив obj полностью заполнен данными
        (исключение типа FullListException)*/
        if (cur == size){
            throw new FullListException("массив obj полностью заполнен данными");
        }
        obj[cur++] = item;
    }

    public void removeLast() throws EmptyListException {
        /*removeLast() на тот случай, если производится попытка удаления элемента из пустого массива obj
        (исключение типа EmptyListException)*/
        if (cur < 1){
            throw new EmptyListException("производится попытка удаления элемента из пустого массива obj");
        }

        obj[--cur] = null;
    }

    public int getSize() {
        return size;
    }
}
