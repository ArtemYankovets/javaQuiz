package com.javadevinterview.quizes.epam.quiz11.tasks;

class Task_11_07 {
    public static void main(String[] args) {
//        T1 t1 = new T1();
//        T2 t2 = new T2(t1);
//        t1.start();
//        t2.start();
    }
}

class T1 implements Runnable {
    public void run() {
        System.out.print("t1");
    }
}

class T2 extends Thread {
    public void run() {
        System.out.print("t2");
    }
}

/*
a)  t1 t2;
b)  t2 t1;
c)* ошибка компиляции: метод start() неопределен вклассе T1;
d)  ничего из перечисленного.
*/