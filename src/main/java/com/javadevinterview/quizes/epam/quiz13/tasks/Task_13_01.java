package com.javadevinterview.quizes.epam.quiz13.tasks;

class Task_13_01 {
    public static void main(String[] args) {
        test(new String[]{null});
    }

    static void test(Object[] o) {
        System.out.print(1);
    }

    static void test(String o) {
        System.out.print(2);
    }

    static void test(String... o) {
        System.out.print(3);
    }

//    static void test(Object... o) {
//        System.out.print(4);
//    }
}

/*
a)	1
b)	2
c)	3
d)	4
e)*	Произойдет ошибка компиляции
f)	Произойдет ошибка во время исполнения программы
*/