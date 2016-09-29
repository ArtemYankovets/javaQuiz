package com.javadevinterview.quizes.epam.Epam_test_2;

/**
 * Created by Serzh on 9/27/16.
 */
//a)a = 3, b = 0
//b)a = 3, b = 3
//c)a = 0, b = 0
//d)a = 0, b = 3 e)Ошибка компиляции f)Ошибка выполнения
public class Question_1 {
    static int b = Question_1.a;
    static final int a = 3;

    public static void main(String... args) {
        System.out.println("a = " + a + ", b = " + b); // a = 3, b = 3
    }
}
