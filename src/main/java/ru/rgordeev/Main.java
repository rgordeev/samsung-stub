package ru.rgordeev;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble();
        double b = in.nextDouble();

        System.out.println(task4(a, b));
    }

    /**
     * 6 DIGIT
     * 15 NUM
     * 125 OTHER
     *
     * @param a
     * @return
     */
    public static String task1(int a) {
        if (a >=0 && a < 10)
            return "DIGIT";
        else if (a >= 10 && a < 100)
            return "NUM";
        return "OTHER";
    }

    public static String task4(Double a, Double b) {
        if (a == 0 && b < 0)
            return "no such x";
        if (a == 0 && b > 0)
            return "any x";
        if (a < 0 && b < 0)
            return "no such x";
        if (a < 0 && b > 0) {
            double x1 = b / a;
            double x2 = -b / a;
            return String.format("%.1f<x<%.1f", x1, x2);
        }
        if (a > 0 && b > 0)
            return "any x";
        if (a > 0 && b < 0) {
            double x1 = b / a;
            double x2 = -b / a;
            return String.format("x<%.1f or x>%.1f", x1, x2);
        }
        return "no such x";
    }
}
