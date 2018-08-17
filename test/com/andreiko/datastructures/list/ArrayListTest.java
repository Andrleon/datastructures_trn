package com.andreiko.datastructures.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
    private ArrayList arrayWithThreeElements = new ArrayList();
    private ArrayList emptyArray = new ArrayList();

    @Before
    public void before() {
        arrayWithThreeElements.add("A");
        arrayWithThreeElements.add("B");
        arrayWithThreeElements.add("C");
    }

    @Test
    public void testGetByIndex() {
        assertEquals(3, arrayWithThreeElements.size());

        assertEquals("A", arrayWithThreeElements.get(0));
        assertEquals("B", arrayWithThreeElements.get(1));
        assertEquals("C", arrayWithThreeElements.get(2));
    }

    @Test
    public void testSize() {
        assertEquals(3, arrayWithThreeElements.size());
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testSetByIndex() {
        Object oldValue = arrayWithThreeElements.set("Q", 0);
        assertEquals("A", oldValue);
        assertEquals("Q", arrayWithThreeElements.get(0));
        arrayWithThreeElements.set("r", -1);
        arrayWithThreeElements.set("r", 3);
    }

    @Test
    public void testIsEmpty() {
        assertEquals(0, emptyArray.size());
        assertEquals(true, emptyArray.isEmpty());
        assertEquals(false, arrayWithThreeElements.isEmpty());
    }

    @Test
    public void testAddByIndex() {
        arrayWithThreeElements.add("Q",1);
        assertEquals(4, arrayWithThreeElements.size());
        assertEquals("A", arrayWithThreeElements.get(0));
        assertEquals("Q", arrayWithThreeElements.get(1));
        assertEquals("B", arrayWithThreeElements.get(2));
        assertEquals("C", arrayWithThreeElements.get(3));
        arrayWithThreeElements.add("z",3);
    }

    @Test
    public void testRemoveByIndex() {
        Object removedValue = arrayWithThreeElements.remove(1);
        assertEquals("B", removedValue);
        assertEquals(2, arrayWithThreeElements.size());
        assertEquals("A", arrayWithThreeElements.get(0));
        assertEquals("C", arrayWithThreeElements.get(1));
    }



}