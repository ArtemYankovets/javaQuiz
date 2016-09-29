package com.javadevinterview.quizes.epam.quiz11.tasks;

class Task_11_05 {
    public static void main(String[] args) {
        Owner ob = new Owner();
        Abstract abs = ob.meth();
        abs.meth();
    }
}

abstract class Abstract {
    abstract Abstract meth();
}

class Owner {
    Abstract meth() {
        class Inner extends Abstract {
            Abstract meth() {
                System.out.print("inner");
                return new Inner();
            }
        }
        return new Inner();
    }
}

/*
Вопрос5.
Что будет выведенно на экран

a)  inner;
b)  inner inner;
c)  inner inner inner;
d)  ошибка компиляции;
*/