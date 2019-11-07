package ru.rgordeev.task18;

import java.util.Scanner;

public class Task4 {
    public static void main(String [] arg) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = gen(n);
        for (int b: a) {
            System.out.print(b + " ");
        }
    }

    private static int[] gen(int n) {
        int [] result = new int[n];
        int j = 0;
        for (int i = 4; i < 4 + n * 3; i = i + 3) {
            result[i - (4 + 2 * j)] = i;
            j = j + 1;
        }
        return result;
    }
}
