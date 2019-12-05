package ru.rgordeev.task223;

import java.util.Locale;

public class Vector2D {
    public double vX;
    public double vY;

    public Vector2D() {
        count++;
        this.vX = 1;
        this.vY = 1;
    }

    public Vector2D(double vX, double vY) {
        this();
        this.vX = vX;
        this.vY = vY;
    }

    public Vector2D(Vector2D vector) {
        this();
        this.vY = vector.vY;
        this.vX = vector.vX;
    }

    public void print() {
        System.out.print(String.format(Locale.US, "(%.2f, %.2f)", this.vX, this.vY));
    }

    public double length() {
        return Math.sqrt(vX * vX + vY * vY);
    }

    public Vector2D add(Vector2D v) {
        return new Vector2D(this.vX + v.vX, this.vY + v.vY);
    }

    public Vector2D sub(Vector2D v) {
        return new Vector2D(this.vX - v.vX, this.vY - v.vY);
    }

    Vector2D scale(double scaleFactor) {
        return new Vector2D(this.vX * scaleFactor, this.vY * scaleFactor);
    }

    public Vector2D normalized() {
        return new Vector2D(this.vX / length(), this.vY / length());
    }

    public double dotProduct(Vector2D v) {
        return this.vX * v.vX + this.vY * v.vY;
    }

    public static Integer count = 0;
}
