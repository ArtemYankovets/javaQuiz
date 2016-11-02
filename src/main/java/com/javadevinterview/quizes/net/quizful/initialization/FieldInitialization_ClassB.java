package com.javadevinterview.quizes.net.quizful.initialization;

public class FieldInitialization_ClassB extends FieldInitialization_ClassA{

    int ns4B;
    int ns1B = init("ns1B", "[Class B] In non-static fields");
    int ns2B = init("ns2B", "[Class B] In non-static fields");
    int ns3B;

    static int s1B = init("s1B", "[Class B] In static fields");
    static int s2B = init("s2B", "[Class B] In static fields");
    static int s3B;

    FieldInitialization_ClassB()
    {
        ns4B = init("ns4B", "[Class B] In constructor");
    }

    {
        ns3B = init("ns3B", "[Class B] In non-static initialization block");
    }

    static
    {
        s3B = init("s3B", "[Class B] In static initialization block");
    }

    static int init(String msg, String whereInit)
    {
        System.out.println(msg + " " + whereInit);
        return 0;
    }
}

