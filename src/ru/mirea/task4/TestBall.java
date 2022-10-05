package ru.mirea.task4;

public class TestBall {
    public static void main(String[] args) {
        Ball b1 = new Ball(1, 1);

        b1.setX(10);
        b1.setY(15);
        System.out.println("X: " + b1.getX() +
                "\nY: " + b1.getY());
        b1.setXY(-3, -5);
        System.out.println("X: " + b1.getX() +
                "\nY: " + b1.getY());
        b1.move(30, 15);
        System.out.println(b1);
    }
}