package com.javadevinterview.quizes.epam.quiz12.tasks;

class Task_12_10 {
    private static boolean ready;
    private static int number;

    private static class ReaderThread extends Thread {
        public void run() {
            while (!ready)
                Thread.yield();
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new ReaderThread().start();
        number = 42;
        ready = true;
    }
}

/*
a)*	42
b)	0
c)	Программа никогда не завершится
d)	Результат выполнения предсказать невозможно
*/