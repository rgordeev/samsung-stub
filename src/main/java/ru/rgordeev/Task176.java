package ru.rgordeev;

import java.util.Scanner;

public class Task176 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(summ(a));
    }

    private static int summ(int a) {
        if (a <= 25) return 0;
        int acc = 0;
        int even = 26;
        while (even < a) {
            acc = acc + even;
            even = even + 2;
        }
        return acc;
    }
}
