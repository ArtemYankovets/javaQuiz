package com.javadevinterview.quizes.net.quizful;

public class Test {

    private String name;

    Test(String name) {
        this.name = name;
    }

    public void test(Test test) {
        test = new Test("three");
    }

    @Override
    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Test t1 = new Test("one");
        Test t2 = new Test("two");
        t1.test(t2);
        System.out.println(t2);
    }
}


/*
a)  Ошибка компиляции
b)  Ошибка выполнения
c)* two
d)  one
e)  three

Пояснение: Ссылки в метод передаются по значению и изменять их переназначая на новые объекты нельзя.
*/