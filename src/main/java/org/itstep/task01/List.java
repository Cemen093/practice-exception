package org.itstep.task01;

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

    public void add(Object item) {
        obj[cur++] = item;
    }

    public void removeLast() {
        obj[--cur] = null;
    }
}
