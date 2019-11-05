package ru.rgordeev;

import java.util.Scanner;

public class Task1710 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        System.out.println(minPrime(a));
    }

    private static int minPrime(int a) {
        do {
            a = a + 1;
        } while (!isPrime(a));
        return a;
    }

    private static boolean isPrime(int a) {
        if (a == 1) return true;
        if (a == 2) return true;
        if (a % 2 == 0) return false;
        int i = 3;
        while (i < a) {
            if (a % i == 0 && i != a) return false;
            i = i + 2;
        }
        return true;
    }
}
