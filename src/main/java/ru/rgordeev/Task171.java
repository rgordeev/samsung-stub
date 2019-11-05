package ru.rgordeev;

import java.util.Scanner;

public class Task171 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int a = 0;
        do {
            a = in.nextInt();
            count++;
        } while (a >= 0);

        System.out.println(count);
    }
}
