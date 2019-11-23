package ru.rgordeev.task111;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(fill(n));

    }

    static private int[][] fill(int n) {
        int[][] a = new int[2 * n + 1][2 * n + 1];
        int s = 2 * n;
        int c = (s + 1) * (s + 1) - 1;

        for (int k = 0; k <= n; ++k) {
            for (int i = k; i < s - k; ++i) a[i][s - k] = c--;
            for (int i = k; i < s - k; ++i) a[s - k][s - i] = c--;
            for (int i = k; i < s - k; ++i) a[s - i][k] = c--;
            for (int i = k; i < s - k; ++i) a[k][i] = c--;
        }

        return a;
    }

    static private void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(String.format("%3d", a[i][j]));
            }
            System.out.println();
        }
    }
}
