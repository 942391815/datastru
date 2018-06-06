package com.test.java.recursion;

/**
 * Created by Micheal on 2018/5/27.
 */
public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(getNum(20));
    }
    public static int getNum(int n){
        if(n==1){
            return 0;
        }else if(n==2){
            return 1;
        }else{
            return getNum(n-1)+getNum(n-2);
        }
    }
}
