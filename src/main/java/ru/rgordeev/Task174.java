package ru.rgordeev;

import java.util.Scanner;

public class Task174 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println(divide(a, b));
    }

    private static String divide(int a, int b) {
        int acc = 0;
        while (a - b >= 0) {
            acc = acc + 1;
            a = a - b;
        }
        return String.format("%d %d", acc, a);
    }
}
