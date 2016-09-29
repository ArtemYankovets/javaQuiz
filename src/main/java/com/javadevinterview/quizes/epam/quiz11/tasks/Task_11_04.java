package com.javadevinterview.quizes.epam.quiz11.tasks;

import java.util.Set;
import java.util.TreeSet;

class Task_11_04 {
    private static Set<String> set = new TreeSet<String>();

    public static void main(String[] args) {
        set.add("one");
        set.add("two");
        set.add("three");
        set.add("/u000a");
        set.add("/u000d");
        set.add("/u000c");
        set.add("1");
        set.add("2");
        set.add("3");
        for (String string : set) {
            System.out.print(string + " ");
        }
    }
}

/*
a)	Ошибкавременивыполнения
b)*	/u000a /u000c /u000d 1 2 3 one three two
c)  one two three /u000a /u000d /u000c 1 2 3
d)	3 2 two 1 /u000a one three /u000c /u000d
e)	Ошибка компиляции
f)	Ничего из вышеперечисленного
*/