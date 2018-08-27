package com.andreiko.datastructures.stack;

/**
 * Created by dsk16 on 8/16/2018.
 */



public class Methods {

    // приминает 2 инта, а и б, возвращает большее их этих 2х чисел

    int maximum(int a, int b){
         return a > b ? a : b;
        //return Math.max(a,b);
    }

    // принимает 3 инта, возвращает большее из них
    int maximum (int a, int b, int c){
        return a > maximum(b, c) ? a : maximum(b, c);
    }

    //приминает 5 интов, возвращает большее из них
    int maximum (int a, int b, int c, int d, int e){
        return maximum(a, b, c) > maximum(d, e) ? maximum(a, b, c) : maximum(d, e);
    }


    // метод принимает инт, и возвращает факториал от заданого инта

    int factorial(int a){
        int f = 1;
        for (int i = 1; i <= a; i++ ){
            f *= i;
        }
        return f;
    }

    // принимает инт год, и возвращает тру если год высокосный
    boolean isLeapYear(int year){
     return ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0));
    }


    // метод принимает int n, и выводит на экран первые n чисел Фибоначи
    int fibonacci(int n){
        int f;
        //for (int i = 0; i <= n; i ++){

        return 0;

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


    }

}
