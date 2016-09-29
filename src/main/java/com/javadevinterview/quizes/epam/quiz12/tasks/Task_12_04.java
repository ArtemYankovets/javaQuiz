package com.javadevinterview.quizes.epam.quiz12.tasks;

class Task_12_04 {
    public static void main(String[] args) {
        AA a = new AA();
        BB b = new BB();
        CC c = new CC();
        Min m = null;

        b = (CC) m; //1
        m = (Min) b;  //2

        AA a2 = (AA) m; //3
        BB b2 = (BB) a2; //4
        Min m2 = (CC) b2; //5
        CC c2 = (CC) m2;
    }
}

interface Min {
}

class AA {
}

class BB extends AA implements Min {
}

class CC extends BB {
}

/*
a)	Ошибка выполнения
b)	Ошибка компиляции в 1
c)	Ошибка компиляции в 2
d)	Ошибка компиляции в 3
e)	Ошибка компиляции в 4
f)	Ошибка компиляции в 5
g)* Код скомпилируется и выполнится без исключений
*/