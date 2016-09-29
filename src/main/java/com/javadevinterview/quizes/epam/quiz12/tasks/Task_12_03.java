package com.javadevinterview.quizes.epam.quiz12.tasks;

class Task_12_03 {
    public static void main(String[] args) {
        I.Inner ii = new I.Inner();
        I.Inner ib = new B.Inner();
        B.Inner bb = new B.Inner();
        B.Inner bi = new I.Inner();
        C.Inner ci = new C.Inner();
        C.Inner ci2 = new C().new Inner2();
    }
}

interface I {
    class Inner {
        Inner() {
            System.out.print(j++);
        }

        static int j;
    }
}

class B implements I {
}

class C extends B implements I {
    public class Inner2 extends Inner {
    }
}


/*
a)	Программа выведет на консоль 0123
b)*	Программа выведет на консоль 012345
c)	Программа выведет на консоль 01
d)	Произойдет ошибка компиляции
e)	Программа выведет на консоль 01234
*/