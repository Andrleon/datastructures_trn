package com.andreiko.task;


import org.junit.Test;
import static org.junit.Assert.*;


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
        int[] fibonacci7  = {0, 1, 1, 2, 3, 5, 8, 13};
        int[] fibonacci0  = {0};
        assertArrayEquals(fibonacci0, methods.fibonacci(0));
        assertArrayEquals(fibonacci7, methods.fibonacci(7));
    }



    // 1.принимает массив чаров, возвращает строку состоящую из символов массива
    @Test
    public void testCharArrayToString() {
        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String expected = "Hello";
        assertEquals(expected, methods.charArrayToString(charArray));
    }

    //2.принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
    @Test
    public void testGetIndexOfInt(){
        int[] intArray = {4, 34, 76745, 7, -10, 7};
        assertEquals(3, methods.getIndexOfInt(intArray, 7));
        assertEquals(-1, methods.getIndexOfInt(intArray, -7));
    }

    //3.принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
    @Test
    public void testGetLastIndexOfInt(){
        int[] intArray = {4, 34, 76745, 7, -10, 7};
        assertEquals(5, methods.getLastIndexOfInt(intArray, 7));
        assertEquals(-1, methods.getLastIndexOfInt(intArray, -7));
    }


    //5.приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
    @Test
    public void testGetMultiples() {
        int[] inputArray  = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        int[] expected1  = {0, 2, 4, 6 , 8};
        int[] expected2  = {0};
        assertArrayEquals(expected1, methods.getMultiples(inputArray, 2));
        assertArrayEquals(expected2, methods.getMultiples(inputArray, 43));
    }

    //6.метод принимает массив интов сортирует его по возрастанию
    @Test
    public void testSort() {
        int[] inputArray  = {110, 1, -2, 3, 1, 5, -6, 7, 8};
        int[] expected1  = {-6, -2, 1, 1, 3, 5 , 7, 8, 110};
        assertArrayEquals(expected1, methods.sort(inputArray));
    }


    //7.принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
    @Test
    public void testHasDups() {
        byte[] inputLargeArrayWitDups  = new byte[300];
        for (int i = 0; i < 300; i++) {
            inputLargeArrayWitDups[i] = (i <= 256) ? (byte)(-128 + i) : (byte)(256 - i);
        }
        byte[] inputArrayWitDups  = {110, 1, -2, 7, 1, 5, -6, 7, 8};
        byte[] inputArrayWithoutDups  = {110};
        assertTrue(methods.hasDups(inputArrayWitDups));
        assertTrue(methods.hasDups(inputLargeArrayWitDups));
        assertFalse(methods.hasDups(inputArrayWithoutDups));
    }

}