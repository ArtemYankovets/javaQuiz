package com.javadevinterview.quizes.epam.quiz12.tasks;

import java.util.NavigableMap;
import java.util.TreeMap;

class Task_12_09 {
    public static void main(String[] args) {
        TreeMap<String, Integer> myMap = new TreeMap<String, Integer>();
        myMap.put("ab", 1);
        myMap.put("ca", 2);
        myMap.put("ba", 3);

        NavigableMap<String, Integer> myMap1 = myMap.headMap("da", true);
        myMap.put("ea", 4);
        myMap1.put("bc", 5);

        System.out.println(myMap1.get("ab") + " " + myMap1.get("ea"));
    }
}

/*
a)	null null
b)	null 4
c)*	1 null
d)	1 4
e)	произойдет ошибка компиляции
f)	будет брошено исключение во время выполнения
*/