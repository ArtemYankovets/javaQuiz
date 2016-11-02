package com.javadevinterview.quizes.net.quizful.initialization;

public class FieldInitialization_ClassA {

    int ns1 = init("ns1", "[Class A] In non-static fields");
    int ns2 = init("ns2", "[Class A] In non-static fields");
    int ns3;
    int ns4;

    static {
        s1 = init("s1", "[Class A] In static initialization block");
    }
    static int s2 = init("s2", "[Class A] In static fields");
    static int s3 = init("s3", "[Class A] In static fields");

    static int s1;

    FieldInitialization_ClassA() {
        ns4 = init("ns4", "[Class A] In constructor");
    }

    {
        ns3 = init("ns3", "[Class A] In non-static initialization block");
    }

    static int init(String msg, String whereInit) {
        System.out.println(msg + " " + whereInit);
        return 0;
    }
}

