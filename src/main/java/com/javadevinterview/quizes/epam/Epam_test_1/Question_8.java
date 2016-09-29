package com.javadevinterview.quizes.epam.Epam_test_1;

/**
 * Created by Serzh on 9/27/16.
 */
//Какой код нужно вставить на место строки "String s = new String();",
//чтобы корректно получить строковое представление переменной 'l'? :
//s = "" + l; -> !!! ??
//s = Long.toString(l);  -> !!!
//s = l.toString();
//s = Long.parse(l);
public class Question_8 {
    public static void main(String[] args) {
        long l = 100;
        String s = "" + l;
        System.out.println(s);
    }
}
