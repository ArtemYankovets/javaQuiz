package com.javadevinterview.quizes.epam.quiz12.tasks;

import java.util.*;

class Task_12_02 {
    public static void main(String[] args) {
        Object obj = new LinkedHashMap();

        if (obj instanceof Collection)
            System.out.print("For ");

        if (obj instanceof Map)
            System.out.print("A Few ");

        if (obj instanceof LinkedList)
            System.out.print("Dollars More ");

        if (obj instanceof HashMap)
            System.out.print("Good Men");
    }
}

/*
a)*	Программа выведет "A Few Good Men" без кавычек.
b)	Программа выведет "For A Few Good Men" без кавычек.
c)	Программа выведет "For A Few Dollars More Good Men" без кавычек.
d)	Программа выведет "For A Few Dollars More" без кавычек.
e)	Программа выведет "For A Few" без кавычек.
*/