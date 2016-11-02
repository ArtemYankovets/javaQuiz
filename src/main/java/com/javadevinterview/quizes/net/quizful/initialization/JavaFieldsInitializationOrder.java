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
1. инициализация [статических полей] в месте объявления и [статические блоки выполняются] в порядке их объявления в классе (сперва в базовом классе затем в производном)
2. инициализация [полей объекта] в месте объявления и [не статические блоки] выполняются в порядке их объявления в объекте (сперва в базовом классе затем в производном)
3. инициализация в конструкторе (сперва в базовом классе затем в производном)

 */