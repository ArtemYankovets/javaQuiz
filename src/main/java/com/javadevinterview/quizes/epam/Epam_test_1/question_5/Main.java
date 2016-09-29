package com.javadevinterview.quizes.epam.Epam_test_1.question_5;

/**
 * Created by Serzh on 9/27/16.
 */
//Ошибка времени выполнения
//Будет напечатано "TEST " без кавычек
//Будет напечатано "TEST TEST " без кавычек -> !!!
//Будет напечатано "TEST TEST TEST " без кавычек
//Зацикливание
public class Main {
    public static void main(String[] args) {
        label1:
        for (int i = 0; i < 3; i++) {
            if (i == 1) continue label1; // аналогично if (i == 1) continue;
            label2:
            System.out.print("TEST ");
            label3:
            ;
        }
    }
}
