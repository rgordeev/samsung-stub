package ru.rgordeev;

import java.util.Scanner;

public class Task177 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(count(a));
    }

    private static int count(int a) {
        int acc = 0;
        while (a > 0) {
            acc = acc + 1;
            a = a / 10;
        }
        return acc;
    }
}
