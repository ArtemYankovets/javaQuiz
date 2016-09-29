package com.javadevinterview.quizes.epam.quiz12.tasks;

class Task_12_06 {
    public static void main(String[] args) {
        new Overload().call();
    }
}

class Overload {
    String c;

    void m(Object o) {
        c = "Object";
    }

    void m(Number n) {
        c = "Number";
    }

    void m(Float s) {
        c = "Float";
    }

    void call() {
        m(null);
        System.out.println(c);
    }
}

/*
a)*	Напечатает Float
b)	Напечатает Object
c)	Ошибка компиляции
d)	Ошибка выполнения
e)	Напечатает Number
*/