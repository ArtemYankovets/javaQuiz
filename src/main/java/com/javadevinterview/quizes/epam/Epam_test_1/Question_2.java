package com.javadevinterview.quizes.epam.Epam_test_1;

/**
 * Created by Serzh on 9/27/16.
 */
//a)На экран выведется число 255
//b)  Произойдет зацикливание программы
//c)  На экран выведется число -128
//d)  На экран выведется число 127
public class Question_2 {

    public static void main(String[] args) {
        byte b = 0;
        while (++b > 0) ;
        System.out.println(b); // -128
    }

}
