package com.javadevinterview.quizes.epam.quiz12.tasks;

class Task_12_05 {
    public static void main(String[] args) {
        try {
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void test() throws Exception {
        try {
            throw new Exception("A");
        } finally {
            throw new Exception("B");
        }
    }
}

/*
a)	На консоль выведется "A“
b)*	На консоль выведется "B“
c)	На консоль выведется "AB“
d)	На консоль выведется "BA“
e)	Произойдёт ошибка на этапе компиляции
*/