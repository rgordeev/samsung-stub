package ru.rgordeev;

import java.util.Scanner;

public class Task173 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int sum = 0;
        while (isDoubleZero(a)) {
            sum = sum + sum(a);
            a = in.nextInt();
        }
        System.out.println(sum);
    }

    private static int sum(int a) {
        if (a == 0) return 0;
        return a % 10 + sum(a / 10);
    }

    private static boolean isDoubleZero(int a) {
        if (a > 9 && a < 100) return true;
        return false;
    }
}
