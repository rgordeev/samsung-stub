package ru.rgordeev.task111;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] a = new int[n][m];
        for (int i = 0; i < n; i++)
            for(int j = 0; j < m; j++)
                a[i][j] = in.nextInt();
        System.out.println(m + " " + n);
        print(rotate(a, n, m));

    }

    static private void print(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    static private int[][] tr(int[][] a, int n, int m) {
        int[][] b = new int[m][n];
        for(int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                b[j][i] = a[i][j];
        return b;
    }

    static private int[][] rotate(int[][] a, int n, int m) {
        int[][] b = new int[m][n];
        for(int i = n - 1; i >= 0; i--)
            for (int j = 0; j < m; j++)
                b[j][n - i - 1] = a[i][j];
        return b;
    }

}
