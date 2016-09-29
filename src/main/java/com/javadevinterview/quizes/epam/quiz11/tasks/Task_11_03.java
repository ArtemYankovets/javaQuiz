package com.javadevinterview.quizes.epam.quiz11.tasks;

class Task_11_03 {

    public static void main(String[] args) {
        try {
            System.out.println("Inside try-block");
        } catch (Exception e) {
        }
    }
}

/*
Вопрос3.
Какие из этих кусков кода не вызовут ошибок компиляции?
a)  try {
        System.out.println("Inside try-block");
    }
    catch (Exception e) {}
    catch (IOException e) {}

b)  try {
        System.out.print("Inside empty try");
    }
    System.out.print("\n");
    catch (Exception e) {}

c)  try {
        System.out.println("Inside try-block");
    }
    catch (IOException e) {}

d)* try {
        System.out.println("Inside try-block");
    }
    catch (Exception e) {}
*/