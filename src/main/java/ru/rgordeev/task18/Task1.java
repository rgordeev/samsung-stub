package ru.rgordeev.task18;

import java.util.Scanner;

public class Task1 {
    public static void main(String [] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = read(n, in);
        int pattern = in.nextInt();

        int i = 1;
        for (int b: a) {
            if (pattern == b)
                break;
            i = i + 1;
        }
        if (i == a.length + 1)
            System.out.println("NO");
        else
            System.out.println(i);
    }

    private static int[] read(int n, Scanner in) {
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }
}
