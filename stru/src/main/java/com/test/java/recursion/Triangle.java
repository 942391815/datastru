package com.test.java.recursion;

/**
 * Created by Micheal on 2018/5/27.
 */
public class Triangle {
    public static void main(String[] args) {
        System.out.println(getNum(5000));
        System.out.println(getNum2(5000));
    }

    public static int getNum(int n) {
        int total = 0;
        while (n > 0) {
            total = total + n;
            n = n - 1;
        }
        return total;
    }

    public static int getNum2(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + getNum2(n-1);
        }
    }
}
