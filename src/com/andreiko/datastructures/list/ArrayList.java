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
        extendArray();
        array[size] = value;
        size++;
    }

    @Override
    public void add(Object value, int index) {
        checkIndex(index);
        extendArray();
        System.arraycopy(array,index, array, index +1, size - index);
        array[index] = value;
        size++;
    }

    @Override
    public Object remove(int index) {
        checkIndex(index);
        Object removedValue = array[index];
        System.arraycopy(array,index + 1, array, index, size - index);
        size--;
        return removedValue;
    }

    @Override
    public Object get(int index) {
        checkIndex(index);
        return array[index];
    }

    @Override
    public Object set(Object value, int index) {
        checkIndex(index);
        Object oldValue = array[index];
        array[index] = value;
        return oldValue;
    }

    @Override
    public void clear() {
        for (int i = 0; i < size; i++) array[i] = null;
        size = 0;
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
        for (Object o: array){
            if (o == value)
                return true;
        }
        return false;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object value) {
        for (int i = size-1; i >=0 ; i--) {
            if (array[i] == value)
                return i;
        }
        return -1;
    }

    @Override
    public String toString(){
        String str = "[";
        if (size > 0){
        for (int i = 0; i < size - 1; i++) {
            str += array[i].toString() + ", ";
            }
            str += array[size - 1];
        }
        str += "]";
        return str;
    }



    private void checkIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index should be >= 0 and < size");
        }
    }

    private void extendArray(){
        if (array.length == size){
            Object[] newArray = new Object[size + INITIAL_CAPACITY];
            System.arraycopy(array, 0,newArray,0,size);
            array = newArray;
        }
    }

}