package com.javadevinterview.quizes.epam.quiz11.tasks;

class Task_11_06 {
    public static void main(String[] args) {
        Thread t1 = new Thread();
        t1.setPriority(7);

        ThreadGroup tg = new ThreadGroup("TG");
        tg.setMaxPriority(8);
        Thread t2 = new Thread(tg, "t2");

        System.out.print("приоритет t1=" + t1.getPriority());
        System.out.print(", приоритет t2=" + t2.getPriority());
    }
}

/*
Вопрос6.
a)* приоритет t1=7, приоритет t2=5;
b)  приоритет t1=7, приоритет t2=8;
c)  приоритет t1=10, приоритет t2=8;
*/