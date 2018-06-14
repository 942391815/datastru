package com.test.java.sort;

import java.util.Arrays;

/**
 * Created by Micheal on 2018/6/13.
 */
public class Test {

    public static void main(String[] args) {
        int[] a = {1, 2, 4, 5, 7, 4, 5, 3, 9, 0};
        System.out.println(Arrays.toString(a));
        sort(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));
    }

    public static void sort(int a[], int low, int high) {
        if (low > high) {
            return;
        }
        int i = low;
        int j = high;
        int index = a[low];

        while (i < j) {
            while (i < j && a[j] > index) {
                j--;
            }
            while (i < j && a[i] <= index) {
                i++;
            }

            if (i < j) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        int p = a[low];
        a[low] = a[i];
        a[i] = p;

        sort(a, low, i - 1);
        sort(a, i + 1, high);
    }
}
