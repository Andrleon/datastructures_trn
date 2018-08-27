package com.andreiko.datastructures.stack;

import java.util.NoSuchElementException;

/**
 * Created by dsk16 on 8/16/2018.
 */
public class ArrayStack implements Stack {
    private static int INITIAL_CAPACITY = 2;
    private Object array[];
    private int size;

    public ArrayStack(){
        array = new Object[INITIAL_CAPACITY];
    }

    @Override
    public void push(Object value) {
        if (array.length == size) {
            Object[] newArray = new Object[size * 2];
            System.arraycopy(array, 0, newArray,0, size);
            array = newArray;
        }
        array[size] = value;
        size++;
    }

    @Override
    public Object pop() {
        if (size == 0)
            throw new NoSuchElementException("Stack size is 0");
        Object val = array[size-1];
        array[size-1] = null;
        size--;
        return val;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Object peek() {
        if (size == 0)
            throw new NoSuchElementException("Stack size is 0");
        return array[size-1];
    }
}