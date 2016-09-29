package com.javadevinterview.quizes.epam.Epam_test_1.question_3;

/**
 * Created by Serzh on 9/27/16.
 */
//Ошибка времени выполнения
//Напечатает "12" без кавычек
//Ошибка компиляции
public class Test {
    public static void main(String[] args) {
        Impl test = new Impl();
        I_A a;
        a = test;
        a.out1();
        ((I_B) a).out2(); // 12
    }
}
