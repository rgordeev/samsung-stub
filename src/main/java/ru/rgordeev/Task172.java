package ru.rgordeev;

import java.util.Scanner;

public class Task172 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        int a = 0;
        do {
            a = in.nextInt();
            if (a > 10)
                sum = sum + a;
        } while (a % 5 != 0);
        System.out.println(sum);
    }
}
