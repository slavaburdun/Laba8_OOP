package ua.kpi.burdun.laba8;

public class MyArrayList {

    private Object[] objArray;
    private int length = 0;

    public MyArrayList() {
        this(10);
    }

    public MyArrayList(int initialCapacity) {
        objArray = new Object[initialCapacity];
    }

    public int size() {
        return length;
    }

    public void print() {
        for (int i = 0; i < length; i++) {
            System.out.println(objArray[i]);
        }
    }

    public void ensureCapasity(int minCapacity) {
        if (minCapacity > length) {
            Object[] arr = new Object[minCapacity];
            System.arraycopy(objArray, 0, arr, 0, length);
            objArray = arr;
        }
    }

    public void add(int index, Object element) {
        if (index <= length) {
            ensureCapasity(length + 1);
            Object[] tArr = new Object[objArray.length];
            System.arraycopy(objArray, 0, tArr, 0, index);
            tArr[index] = element;
            System.arraycopy(objArray, index, tArr, index + 1, length + 1 - (index + 1));
            objArray = tArr;
            length++;
        }
    }

    public void add(Object e) {
        add(length, e);
    }

    public void addAll(int index, Object[] c) {
        for (int i = 0; i < c.length; i++) {
            add(index + i, c[i]);
        }
    }

    public void addAll(Object[] c) {
        for (int i = 0; i < c.length; i++) {
            add(c[i]);
        }
    }

    public Object get(int index) {
        return objArray[index];
    }

    public void set(int index, Object element) {
        if (index <= length) {
            objArray[index] = element;
        }
    }

    public Object remove(int index) {
        Object f = objArray[index];
        Object[] t = new Object[objArray.length - 1];
        System.arraycopy(objArray, 0, t, 0, index);
        for (int i = index + 1; i < length; i++) {
            t[i-1] = objArray[i];
        }
        objArray = t;
        length--;
        return f;
    }

}
