package com.javadevinterview.quizes.epam.quiz11.tasks;

class Task_11_08 {
    public static void main(String[] args) {
        int i = 0;
        int j = 1;
        System.out.println(i += (j < i) ? (2) : (3));  //1
    }
}

/*
a)  1
b)  2
c)* 3
d)  Ошибка компиляции в строке 1
*/