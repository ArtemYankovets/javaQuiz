package com.javadevinterview.quizes.net.quizful.initialization;

public class JavaFieldsInitializationOrder {
    public static void main(String[] args) throws ClassNotFoundException
    {
        FieldInitialization_ClassB testB = new FieldInitialization_ClassB();
    }
}

/*
Result

s1 [Class A] In static initialization block
s2 [Class A] In static fields
s3 [Class A] In static fields
s1B [Class B] In static fields
s2B [Class B] In static fields
s3B [Class B] In static initialization block
ns1 [Class A] In non-static fields
ns2 [Class A] In non-static fields
ns3 [Class A] In non-static initialization block
ns4 [Class A] In constructor
ns1B [Class B] In non-static fields
ns2B [Class B] In non-static fields
ns3B [Class B] In non-static initialization block
ns4B [Class B] In constructor


Explanation

The order of fields initialization
1. Инициализация статических полей, выполнение блока статической инициализации класса-родителя;
2. Инициализация статических полей, выполнение блока статической инициализации класса-потомка;
3. Инициализация не статических полей, выполнение блока не статической инициализации и инициализация в конструкторе класса-родителя;
4. Инициализация не статических полей, выполнение блока не статической инициализации и инициализация в конструкторе класса-потомка.

http://www.quizful.net/post/java-fields-initialization

 */