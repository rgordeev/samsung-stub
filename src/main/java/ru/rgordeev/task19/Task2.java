package ru.rgordeev.task19;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(new Task2().sum());
    }

    private Integer sum() {
        Integer acc = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 7 == 0)
                acc = acc + new Task1().sum(i);
        }
        return acc;
    }

    public class Task1 {
        protected Integer sum(Integer a) {
            return a % 10 + a / 10;
        }
    }
}
