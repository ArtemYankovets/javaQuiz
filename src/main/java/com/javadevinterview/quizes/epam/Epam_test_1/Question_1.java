package com.javadevinterview.quizes.epam.Epam_test_1;

/**
 * Created by Serzh on 9/27/16.
 */
//a) True
//b) False
//c) Ошибка компиляции
public class Question_1 {

    public static void main(String[] args) {

        System.out.println(0.3 == 0.1d + 0.1d + 0.1d); // false

        because:
        System.out.println(0.1d + 0.1d + 0.1d); // 0.30000000000000004
    }

}
