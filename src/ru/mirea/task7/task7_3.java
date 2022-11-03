package ru.mirea.task7;

import ru.mirea.task6.MoveablePoint;
import ru.mirea.task6.Moveable;
import ru.mirea.task6.MoveableCircle;

class task7_3 {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;

    public task7_3(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public String toString() {
        return "MoveablePoint{" + "x=" + x + ", y=" + y + ", xSpeed=" + xSpeed + ", ySpeed=" + ySpeed + '}';
    }

    public void moveUp() {
        y += ySpeed;
    }

    public void moveDown() {
        y -= ySpeed;
    }

    public void moveLeft() {
        x += xSpeed;
    }

    public void moveRight() {
        x += xSpeed;
    }
}

class MoveableRectangle {
    MoveablePoint topLeft;
    MoveablePoint topRight;

    public MoveableRectangle(MoveablePoint topLeft, MoveablePoint topRight, double xSpeed, double ySpeed) {
        this.topLeft = topLeft;
        this.topRight = topRight;
    }

    String intToString(double value) {
        return String.valueOf(value);
    }
    boolean SpeedTest() {
        return topLeft.xSpeed == topRight.xSpeed && topLeft.ySpeed == topRight.ySpeed;
    }
}