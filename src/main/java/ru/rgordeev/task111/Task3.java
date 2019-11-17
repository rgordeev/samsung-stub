package ru.rgordeev.task111;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++)
            for(int j = 0; j < n; j++)
                a[i][j] = in.nextInt();
        System.out.println(isSymmentric(a, n));
    }

    static private String isSymmentric(int[][] a, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j && a[i][j] != a[j][i]) return "no";
            }
        }
        return "yes";
    }
}
