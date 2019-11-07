package ru.rgordeev.task18;

import java.util.Scanner;

public class Task6 {
    public static void main(String [] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = read(n, in);

        int[] c = count(a);
        int m = max(c);
        int minIndex = minIndex(c, m);

        System.out.print(a[minIndex]);
    }

    private static int minIndex(int[] a, int value) {
        for (int i = 0; i< a.length; i ++) {
            if (a[i] == value) return i;
        }
        return -1;
    }

    private static int max(int[] a) {
        int m = 0;
        for (int i = 0; i < a.length; i ++) {
            if(a[i] > m) m = a[i];
        }
        return m;
    }

    private static int[] count(int[] a) {
        int[] result = new int[a.length];
        for (int i = 0; i < result.length; i++)
            result[i] = 0;
        for (int i = 0; i < a.length; i ++) {
            for (int j = 0; j < a.length; j ++) {
                if (a[i] == a[j])
                    result[i] = result[i] + 1;
            }
        }
        return result;
    }

    private static int[] read(int n, Scanner in) {
        int [] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        return a;
    }
}
