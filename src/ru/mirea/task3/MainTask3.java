package ru.mirea.task3;


public class MainTask3 {

    public static void main(String[] args) {
        System.out.println("Задание номер 1\n");
        // Circle
        Circle c0 = new Circle();
        Circle c1 = new Circle(2);

        System.out.println("Радиус c0: "+ c0.getRadius());
        c1.setRadius(5);
        System.out.println("Радиус c1: "+ c1.getRadius());
        System.out.println("Длина окружности c1: "+ c1.getCircumference());
        System.out.println();

        System.out.println("Задание номер 2");
        //Human
        Human Kennedy = new Human();
        Human Steve = new Human(10,10,10);

        Steve.getHuman();
        System.out.println();

        System.out.println("Задание номер 3");
        //Book
        Book bk0 = new Book();
        Book bk1 = new Book("Pholisipher's Stone","J. K. Rowling",1997);
        Book bk2 = new Book("Chamber of Secrets","J. K. Rinling",1998);
        Book bk3 = new Book("Prisoner of Azkaban","J. K. Rinling",1800);

        System.out.println(bk0);

        bk1.setTitle("Philosopher's Stone");
        bk2.setAuthor("J. K. Rowling");
        bk3.setPublish_year(1999);

        System.out.println(bk1);
        System.out.println(bk2);
        System.out.println(bk3);
    }
}