package ru.rgordeev.task18;

import java.util.Scanner;

public class Task3 {
    public static void main(String [] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = read(n, in);
        int acc = 0;
        int count = 0;
        for (int b: a) {
            if (Math.abs(b) % 2 == 1) {
                acc = acc + b;
                count = count + 1;
            }
        }
        if (count == 0) System.out.println("NO");
        else System.out.println(String.format("%.2f", ((double)acc) / count));
    }

    private static int[] read(int n, Scanner in) {
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }
}
