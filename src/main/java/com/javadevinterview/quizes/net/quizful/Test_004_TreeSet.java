package com.javadevinterview.quizes.net.quizful;

import java.util.TreeSet;

public class Test_004_TreeSet {
    public static void main(String[] args) {
        TreeSet<Item> set = new TreeSet<Item>();
        set.add(new Item(2));
        set.add(new Item(5));
        set.add(new Item(2));
        System.out.println(set);

    }

    static class Item {
        int n;

        Item(int n) {
            this.n = n;
        }

        public String toString() {
            return "Item " + n;
        }
    }
}

/*
a)  [Item 2, Item 5]
b)  [Item 2, Item 2, Item 5]
c)* Ошибка времени выполнения
d)  Ошибка компиляции

Explanation
Будет выброшен ClassCastException, т.к. в TreeSet для упорядочивания элементов используется метод compareTo(или compare), соответственно, в нем могут храниться объекты, реализующие интерфейс Comparable, либо необходимо передавать свою реализацию Comparator-а в конструкторе.
 */