package ru.mirea.task3;

public class Circle {
    private double radius;
    private double circumference;

    public Circle(){
        this.radius = 1;
    };
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getCircumference(){
        return Math.PI*2*radius;
    }
}