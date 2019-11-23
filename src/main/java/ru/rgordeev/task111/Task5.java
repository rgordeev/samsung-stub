package ru.rgordeev.task111;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        print(fill(n, m));
    }

    static private int[][] fill(int n, int m) {
        int[][] a = new int[n][m];
        for (int i = 0; i < n * m; i++) {
            int k = i / m;
            int l;
            if (k % 2 == 0) l = i % m;
            else l = m - 1 - i % m;
            a[k][l] = i;
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
