package ru.rgordeev.task18;

import java.util.Scanner;

public class Task2 {
    public static void main(String [] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = read(n, in);
        int acc = 0;
        boolean flag = false;
        for (int b: a) {
            if (b % 2 == 0) {
                acc = acc + b;
                flag = true;
            }
        }
        if (!flag) System.out.println("NO");
        else System.out.println(acc);
    }

    private static int[] read(int n, Scanner in) {
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }
}
