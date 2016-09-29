package com.javadevinterview.quizes.epam.Epam_test_2.question2;

/**
 * Created by Serzh on 9/27/16.
 */
//a) Произойдёт ошибка времени выполнения
//b) Напечатает "obj.x=3" без кавычек
//c) Произойдёт ошибка компиляции
//d) Напечатает "obj.x=1" без кавычек
//e) Напечатает "obj.x=2" без кавычек -> !!!
public class Test {
    private void method1() {
        MyClass obj = new MyClass();
        obj.x = 1;
        method2(obj);
        System.out.println("obj.x=" + obj.x); // obj.x=2
    }

    private void method2(MyClass param) {
        param.x = 2;
        param = new MyClass();
        param.x = 3;
    }

    class MyClass {
        int x;
    }

    public static void main(String[] args) {
        new Test().method1();
    }
}
