package ru.rgordeev.task19;

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer a = in.nextInt();

        System.out.println(new Task1().sum(a));
    }

    protected Integer sum(Integer a) {
        return a % 10 + a / 10;
    }
}
