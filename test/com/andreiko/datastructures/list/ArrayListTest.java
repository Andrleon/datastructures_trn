package com.andreiko.datastructures.list;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayListTest {
    private ArrayList arrayWithThreeElements = new ArrayList();
    private ArrayList arrayWithFiveElementsFirst = new ArrayList();
    private ArrayList arrayWithFiveElementsSecond = new ArrayList();
    private ArrayList arrayWithDuplicates = new ArrayList();
    private ArrayList emptyArray = new ArrayList();

    @Before
    public void before() {
        arrayWithThreeElements.add("A");
        arrayWithThreeElements.add("B");
        arrayWithThreeElements.add("C");

        for (int i = 0; i < 5; i++){
            arrayWithFiveElementsFirst.add(i+1);
            arrayWithFiveElementsSecond.add(i+1);
            arrayWithDuplicates.add("X");
        }
    }

    @Test
    public void testAddExtension() {
        arrayWithFiveElementsFirst.add(6);
        assertEquals(6, arrayWithFiveElementsFirst.size());
        assertEquals(1, arrayWithFiveElementsFirst.get(0));
        assertEquals(6, arrayWithFiveElementsFirst.get(5));
    }

    @Test
    public void testAddByIndexExtension() {
        arrayWithFiveElementsSecond.add(6,3);
        assertEquals(6, arrayWithFiveElementsSecond.size());
        assertEquals(6, arrayWithFiveElementsSecond.get(3));
        assertEquals(5, arrayWithFiveElementsSecond.get(5));
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

    @Test
    public void testSetByIndex() {
        Object oldValue = arrayWithThreeElements.set("Q", 0);
        assertEquals("A", oldValue);
        assertEquals("Q", arrayWithThreeElements.get(0));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testIndexOutOfBoundsSetByIndex() {
        arrayWithThreeElements.set("r", -1);
        arrayWithThreeElements.set("r", 3);
    }



    @Test
    public void testIsEmpty() {
        assertEquals(0, emptyArray.size());
        assertTrue(emptyArray.isEmpty());
        assertFalse(arrayWithThreeElements.isEmpty());
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

    @Test
    public void testContains(){
        assertFalse(arrayWithThreeElements.contains("ZXC"));
        assertTrue(arrayWithFiveElementsFirst.contains(1));
    }


    @Test
    public void testIndexOf(){
        assertEquals(0, arrayWithDuplicates.indexOf("X"));
        assertEquals(-1, arrayWithDuplicates.indexOf("A"));

    }

    @Test
    public void testLastIndexOf(){
        assertEquals(4, arrayWithDuplicates.lastIndexOf("X"));
        assertEquals(-1, arrayWithDuplicates.lastIndexOf("A"));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testClear(){
        arrayWithDuplicates.clear();
        assertEquals(0,arrayWithDuplicates.size());
        arrayWithDuplicates.get(3);
    }

    @Test
    public void testToString(){
        System.out.println(emptyArray.toString());
        assertEquals("[]", emptyArray.toString());
        System.out.println(arrayWithThreeElements.toString());
        assertEquals("[A, B, C]", arrayWithThreeElements.toString());


    }



}