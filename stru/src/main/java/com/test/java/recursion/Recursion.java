package com.test.java.recursion;

/**
 * Created by Micheal on 2018/5/27.
 */
public class Recursion {
    public static void main(String[] args) {
        test2(100);
    }

    public static void test() {
        System.out.println("hello word");
    }

    public static void test2(int n) {
        if (n > 0) {
            System.out.println("hello word");
            test2(n - 1);
        }
    }
}
