package com.javadevinterview.quizes.epam.Epam_test_2;

/**
 * Created by Serzh on 9/27/16.
 */
//a)Программа выведет "1“
// b)Программа выведет "default“
// c)Ошибка времени выполнения
// d)Ошибка компиляции -> !!!
public class Question_4 {
    public static void main(String[] args) {
        final Integer i = 1;
        switch (1) {
//            case i: // Ошибка компиляции. Если final int i = 1; - то ок...
//                System.out.println("1");
//                break;
            default:
                System.out.println("default");
        }
    }
}
