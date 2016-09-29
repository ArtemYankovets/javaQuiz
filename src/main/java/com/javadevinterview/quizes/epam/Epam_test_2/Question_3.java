package com.javadevinterview.quizes.epam.Epam_test_2;

/**
 * Created by Serzh on 9/27/16.
 */
//а) true false -> !!!
//b) true true
//c) false false
//d) false true
public class Question_3 {
    public static void main(String[] args) {
        Integer i1 = 10;
        Integer i2 = 10;
        Double d1 = 10d;
        Double d2 = 10d;
        System.out.println(i1 == i2); //true//The JVM is caching Integer values. == only works for numbers between -128 and 127
        System.out.println(d1 == d2);// false
    }
}
