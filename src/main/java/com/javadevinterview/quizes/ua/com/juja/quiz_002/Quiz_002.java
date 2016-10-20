package com.javadevinterview.quizes.ua.com.juja.quiz_002;

public class Quiz_002 {
    public static void main(String[] args) {
        // Який із записів скомпілюється? Чого так?
//        int v1 = 1; long v2 = 2; v1 = v1 + v2;  // 1
        int v1 = 1; long v2 = 2; v1 += v2;      // 2
    }
}
