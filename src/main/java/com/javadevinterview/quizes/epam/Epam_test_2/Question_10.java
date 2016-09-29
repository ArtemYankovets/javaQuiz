package com.javadevinterview.quizes.epam.Epam_test_2;

/**
 * Created by Serzh on 9/27/16.
 */

public class Question_10 {
    public static void main(String[] args) {
        int[] x = new int[25];
//        Какие утверждения истинны? (Выберите все истинные утверждения)
        boolean b;
//        b = x[25] == 0; //ArrayIndexOutOfBoundsException, итерация начинается с нуля - нет x[25]
//        b = x[0] == null; // int нельзя присвоить null и сравнивать int и null
        b = x.length == 25; // true
        b = x[24] == 0; // true
        System.out.println(b);
    }
}
