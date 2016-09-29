package com.javadevinterview.quizes.epam.quiz13.tasks;

class Task_13_03 {
    public static void main(String[] args) {
    }
}

/*
Вопрос 3.
Дано объявление класса class ClassA<U> implements Comparable<U> {
     public int compareTo(U a) { return 0; } }
Какие 3 из объявлений ниже будут откомпилированы без ошибок?
a)	class ClassB<U,V> extends ClassA<R> {}
b)	class ClassC<U,V> extends ClassA<U> {}
c)	class ClassD<U,V> extends ClassA<V, U> {}
d)	class ClassE<U> extends ClassA<Comparable<Number>> {}
e)	class ClassF<U extends Comparable<U> & Serializable> extends ClassA<Number> {}
f)	class ClassG<U implements Comparable<U>> extends ClassA<Number> {}
g)	class ClassH<U extends Comparable<U>> extends ClassA<? extends Number> {}


Вопрос 4.
public class InnerExample {
  public class Inner {
        static final int x = 3; //1
        static int y = 4;  //2}
   static class Nested { static int z = 5;  }
}
a)	Код скомпилируется
b)	Ошибка компиляции в строках 1 и 2
c)	Ошибка компиляции в строке 2
d)	Ошибка компиляции в строке 1


 
Вопрос 5.
public class Parent {
    protected String value = "parent";
    public static void main(String[] args) {
         Parent parent = new Parent();
         Parent child = new Child();
         System.out.println(parent.value);
         System.out.println(child.value);
         System.out.println(new Child().value); }
 }
class Child extends Parent {
     protected String value = "child"; }


a)	parent
parent
parent
b)	Возникнет ошибка времени выполнения
c)	Возникнет ошибка компиляции
d)	parent
parent
child
e)	parent
child
child
 
Вопрос 6.
public class ForLoop {
     public static void main(String[] args) {
         for (int i = 0, j = 1; i < 1, j < 2; i++) {
             System.out.print("i=" + i + "; ");
             System.out.print("j=" + j + "; ");
             j++;
         }
     }
}
a)	i=1; j=2;
b)	i=0; j=1;
c)	i=0; j=1; i=1; j=2;
d)	Код не скомпилируется
e)	Возникнет ошибка времени выполнения


Вопрос 7.
for (int k = 1; k < 10; k++) {
    if (k % 2 == 1)
     continue;
     System.out.println("Test"); }
a)	0
b)	4
c)	5
d)	6

 

Вопрос 8.
В чем главное отличие классов java.util.Vector и java.util.ArrayList?
a)	ArrayList синхронизирован, Vector - не синхронизирован
b)	ArrayList реализован на основе списка, а Vector – массива
c)*	Vector синхронизирован, ArrayList - не синхронизирован
d)	Vector реализован на основе списка, а ArrayList - массива


Вопрос 9.
public class ArTest {
     public static void main(String[] args) {
         byte b = 127;
         b += 129;
         System.out.println(b);     } }
a)	256
b)	Произойдёт ошибка времени выполнения
c)	255
d)	0
e)	128
f)	Произойдет ошибка компиляции
 

Вопрос 10.
Integer foo = 1000;
Integer bar = 1000;
System.out.println(foo <= bar);
System.out.println(foo >= bar);
System.out.println(foo == bar);

a)	false
    false
    false

b)	true
    true
    false

c)	false
    false
    true

d)	true
    true
    true
*/