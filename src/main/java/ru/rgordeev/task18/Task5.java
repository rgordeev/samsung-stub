package ru.rgordeev.task18;

import java.util.Scanner;

public class Task5 {
    public static void main(String [] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = read(n, in);
        a = reverse(a);
        for (int b : a) {
            System.out.print(b + " ");
        }
    }

    private static int[] reverse(int[] a) {
        int size = a.length;
        for (int i = 0; i < size / 2; i = i + 1) {
            int x = a[i];
            a[i] = a[size - i - 1];
            a[size - i - 1] = x;
        }
        return a;
    }

    private static int[] read(int n, Scanner in) {
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }
}
