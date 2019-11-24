package ru.rgordeev.task112;

import java.util.Scanner;

public class Task16 {
    public static void main(String [] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = read(n, in);
        print(compress(a, n), n);
    }

    private static int[] compress(int[] a, int n) {
        int [] b = new int[n];
        int j = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] != 0) {
                b[j] = a[i];
                j++;
            }
        }
        for (int i = j; i < n; i++) {
            b[i] = 0;
        }
        return b;
    }

    private static void print(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }

    private static int[] read(int n, Scanner in) {
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }
}
