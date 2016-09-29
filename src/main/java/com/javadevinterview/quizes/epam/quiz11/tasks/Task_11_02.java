package com.javadevinterview.quizes.epam.quiz11.tasks;

import java.util.LinkedHashSet;
import java.util.Set;

class Task_11_02 {
    private static Set<String> set = new LinkedHashSet<String>();

    public static void main(String[] args) {
        Integer i1 = new Integer("1");
        Integer i2 = new Integer("2");
        Integer i3 = Integer.valueOf("3");
        int i4 = i1 + i2 + i3;
        System.out.println(i4);
    }
}

/*
a)  Ошибкакомпиляции: Integer class has no constructors which take a String argument
b)  Ошибкакомпиляции: Incorrect argument passed to the valueOf method
c)  Ошибкакомпиляции: Integer objects cannot work with + operator
d)* Программа выведет "6" безкавычек
*/