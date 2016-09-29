package com.javadevinterview.quizes.epam.quiz11.tasks;

class Task_11_09_HouseCat implements Feline{
    public void eat() {
    }
}

// Сюдавставитькод
interface Feline extends Animal {
}

interface Animal {
    void eat();
}

/*
a)* interface Feline extends Animal{}
b)  interface Feline extends Animal{void eat();}
c)  interface Feline extends Animal{void eat(){}}
*/