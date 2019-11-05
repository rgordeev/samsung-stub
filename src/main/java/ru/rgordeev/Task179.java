package ru.rgordeev;

import java.util.Scanner;

public class Task179 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(find(a));
    }

    private static String find(int a) {
        int min = Integer.MAX_VALUE;
        while (a > 0) {
            int b = a % 10;
            a = a / 10;
            if (b < min && b != 0) min = b;
        }
        return String.format("%d", min);
    }
}
