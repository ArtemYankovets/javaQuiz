package com.javadevinterview.quizes.epam.Epam_test_2;

/**
 * Created by Serzh on 9/27/16.
 */
//В результате компиляции и запуска будет выведено:
//a)ошибка компиляции;
//b) a1;
//c) CBA;
//d) C; -> !!!
public class Question_8 {
    public static void main() {
        System.out.println("a1");
    }

    public static void main(String args) {
        System.out.println("B");
    }

    public static void main(String[] args) {
        System.out.println("C");
    }
}
