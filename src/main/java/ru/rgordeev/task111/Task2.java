package ru.rgordeev.task111;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        print(fill(n));
    }

    static private int[][] fill(int n) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j == n - 1) a[i][j] = 1;
                if (i + j < n - 1) a[i][j] = 0;
                if (i + j > n - 1) a[i][j] = 2;
            }
        }
        return a;
    }

    static private void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
