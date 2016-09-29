package com.javadevinterview.quizes.epam.Epam_test_2;

import java.util.Arrays;

/**
 * Created by Serzh on 9/27/16.
 */
//a)[5, 1]
//b)[0, 5]
//c)[5, 0] -> !!!
//d)Ошибка компиляции
public class Question_5 {
    public static void main(String[] args) {
        int[] a = {5, 5};
        int b = 1;
        a[b] = b = 0;
        System.out.println(Arrays.toString(a)); //[5, 0]
    }
}
