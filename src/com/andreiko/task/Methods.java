package com.andreiko.task;

import java.util.Arrays;

/**
 * Created by dsk16 on 8/16/2018.
 */



public class Methods {

    // приминает 2 инта, а и б, возвращает большее их этих 2х чисел

    public int maximum(int a, int b){
         return a > b ? a : b;
        //return Math.max(a,b);
    }

    // принимает 3 инта, возвращает большее из них
    public int maximum (int a, int b, int c){
        return a > maximum(b, c) ? a : maximum(b, c);
    }

    //приминает 5 интов, возвращает большее из них
    public int maximum (int a, int b, int c, int d, int e){
        return maximum(a, b, c) > maximum(d, e) ? maximum(a, b, c) : maximum(d, e);
    }


    // метод принимает инт, и возвращает факториал от заданого инта

    public int factorial(int a){
        int f = 1;
        for (int i = 1; i <= a; i++ ){
            f *= i;
        }
        return f;
    }

    // принимает инт год, и возвращает тру если год высокосный
    public boolean isLeapYear(int year){
     return ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0));
    }


    // метод принимает int n, и выводит на экран первые n чисел Фибоначи
    // 0, 1, 1, 2. 3, 5, 8, 13
    public int[] fibonacci(int n){
        int f[] = new int[n + 1];
        f[0] = 0;
        if (n == 0){
            System.out.println(Arrays.toString(f));
            return f;
        }
        f[1] = 1;
        for (int i = 2; i < n + 1; i++) {
            f[i] = f[i - 2] + f[i - 1];
            }
        System.out.println(Arrays.toString(f));
        return f;
    }

    // 1.принимает массив чаров, возвращает строку состоящую из символов массива
    public String charArrayToString(char[] charArray){
        String str = "";
        for (char c : charArray) {
            str += (String.valueOf(c));
            System.out.println(str);
        }
        return str;

    }

    // 2.принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с начала массива. Если значения в массиве нет возвращает -1
    public int getIndexOfInt(int [] intArray, int element){
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] == element)
                return i;
        }
        return -1;

    }

    // 3.принимает массив интов, и значение типа инт, возвращает индекс массива в котором значение совпадает с передаваемым, начиная с конца массива. Если значения в массиве нет возвращает -1
    public int getLastIndexOfInt(int [] intArray, int element){
        for (int i = intArray.length - 1; i >= 0; i--) {
            if (intArray[i] == element)
                return i;
        }
        return -1;

    }

    //5.приминает массив интов и число, выводит на екран только елементы массива которые кратны этому числу
    public int[] getMultiples(int[] intArray, int multiple){
        int count = 0;
        for (int el : intArray){
            if (el % multiple == 0)
                count++;
        }

        int[] multiples = new int[count];
        count = 0;

        for (int el : intArray){
            if (el % multiple == 0) {
                multiples[count] = el;
                System.out.print(el + " ");
                count++;
            }
        }

        return multiples;
    }

    //6.метод принимает массив интов сортирует его по возрастанию
    public int[] sort(int[] array){
        boolean swapped;
        int temp;

        for (int i = 0; i < array.length - 1 ; i++) {
            swapped = false;
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;

        }
        return array;
    }


    //7.принимает массив байт, если в массиве есть повторяющиеся елементы, возвращает тру
    public boolean hasDups(byte[] array){
        if (array.length > 255)
            return true;
        else
            for (int i = 0; i < array.length - 1 ; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j])
                        return true;
                }

            }
        return false;
    }





    public static void main(String[] args) {
        Methods t = new Methods();
        System.out.println("Max of 2: (3, 5) = " + t.maximum(3, 5));
        System.out.println("Max of 3: (3, 5, 110) = " + t.maximum(3, 5, 110));
        System.out.println("Max of 5: (3, 286, 110, 0, 3) = " + t.maximum(3, 286, 110, 0, 3));
        System.out.println("5! = " + t.factorial(5));
        System.out.println("Is  2000 Leap?  = " + t.isLeapYear(2000));
        System.out.println("Is  2100 Leap?  = " + t.isLeapYear(2100));
        System.out.println("Is  2020 Leap?  = " + t.isLeapYear(2020));
        System.out.println("Is  2019 Leap?  = " + t.isLeapYear(2019));

        char[] charArray = {'H', 'e', 'l', 'l', 'o'};
        String str = t.charArrayToString(charArray);



    }

}
