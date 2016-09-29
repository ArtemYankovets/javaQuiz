package com.javadevinterview.quizes.epam.Epam_test_2;

/**
 * Created by Serzh on 9/27/16.
 */
//a)10 - 6Hello75
//b)Ошибка компиляции
// c)12 - 126Hello75
// d)null
public class Question_6 {
        public static void main(String[] args) {
        int result = 12 + 2 * 5 % 3 - 15 / 4; // 10
        String x = 12 - 6 + "Hello" + 7 + 5; // 6Hello75

        System.out.println(result + " - " + x); //10 - 6Hello75
    }
}
