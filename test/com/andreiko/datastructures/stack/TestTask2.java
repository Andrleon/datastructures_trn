package com.andreiko.datastructures.stack;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by dsk16 on 8/16/2018.
 */
public class TestTask2 {

    private Methods methods = new Methods();

    @Test
    public void testMaxForTwoNumbers() {
        int expected = 5;
        int actual = methods.maximum(3, 5);
        assertEquals(expected, actual);
    }


    @Test
    public void testMaxForThreeNumbers() {
        int expected = 110;
        int actual = methods.maximum(3, 5, 110);
        assertEquals(expected, actual);
    }

    @Test
    public void testFactorial() {
        int expected = 120;
        int actual = methods.factorial(5);
        assertEquals(expected, actual);
    }


    @Test
    public void testIsLeapYear() {
        assertEquals(true, methods.isLeapYear(2000));
        assertEquals(false, methods.isLeapYear(2100));
        assertEquals(false, methods.isLeapYear(2019));
    }


    @Test
    public void testFibonacci() {


    }


}