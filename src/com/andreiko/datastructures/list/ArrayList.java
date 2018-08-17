package com.andreiko.datastructures.list;

import java.util.Arrays;

/**
 * Created by dsk16 on 8/17/2018.
 */
public class ArrayList implements List {
    private static final int INITIAL_CAPACITY = 5;
    private Object[] array = new Object[INITIAL_CAPACITY];
    private int size;

    @Override
    public void add(Object value) {
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index) {

        System.arraycopy(array,index, array, index +1, size - index);
        array[index] = value;
        System.out.println(Arrays.toString(array));
        size++;
    }

    @Override
    public Object remove(int index) {
        return null;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object set(Object value, int index) {
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index should be >= 0 and < size");
        }
        Object oldValue = array[index];
        array[index] = value;
        return oldValue;
    }

    @Override
    public void clear() {

    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object value) {
        return false;
    }

    @Override
    public int indexOf(Object value) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object value) {
        return 0;
    }
}