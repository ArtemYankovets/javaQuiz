package com.javadevinterview.quizes.epam.Epam_test_1;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serzh on 9/27/16.
 */
//Программа выведет на экран содержимое файла -> !!!
//Произойдет ошибка компиляции
//Произойдет ошибка выполнения
public class Question_6 {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(
                    new FileInputStream("src/main/java/ua/com/juja/interviews/epam/Epam_test_1/question_5/text.txt")));
            String str;
            try {
                do {
                    str = br.readLine();
                    System.out.println(str);
                } while (str != null);
            } finally {
                br.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
