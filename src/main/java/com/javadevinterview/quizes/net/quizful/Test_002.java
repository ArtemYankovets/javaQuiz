package com.javadevinterview.quizes.net.quizful;

public class Test_002 {
    public static void main(String args[]) {
        A a = new A();
        a.setI(4);
        if (a instanceof Cloneable) {
//            A a2 = (A) a.clone();
//            System.out.println(a.getI() == a2.getI());
        }
    }
}

class A implements Cloneable {
    private int i;
    public void setI(int i) {
        this.i = i;
    }
    public int getI() {
        return i;
    }
}

/*
a)  true
b)  4
c)  Программа выполнится но ничего не напечатает
d)  false
e)* Произойдет ошибка компиляции

Explanation
Ошибка связана с невоможностью доступа к clone методу. Он protected для класса Object.
А интерфейс Cloneable не содержит никаких методов подлежащих переопределению.

Интерфейсы Cloneable и Serializable являются интерфейсами маркерами и не содержат методов(просто говорят о том что объект можно клонировать и сериализовывать) Фишка в том что метод clone() является private, а значить в данном случае может использоваться только в class A. Вот как то так...

clone() в Object - protected.
*/