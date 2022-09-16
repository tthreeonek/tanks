package ru.mirea.lab2;

public class Ball {
    double range;
    String color;

    public Ball(double range, String color) {
        this.range = range;
        this.color = color;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "range=" + range +
                ", color='" + color + '\'' +
                '}';
    }
}