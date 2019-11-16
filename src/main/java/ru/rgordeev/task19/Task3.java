package ru.rgordeev.task19;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a = in.nextInt();

        System.out.println(new Task3().count(a));
    }

    private Integer count(Integer a) {
        Integer acc = 0;
        for (int i = a - 1; i >= 100; i--) {
            if (sum(i) % 13 == 0)
                acc = acc + 1;
        }
        return acc;
    }

    private Integer sum(int a) {
        if (a == 0) return 0;
        else return a % 10 + sum(a / 10);
    }
}
