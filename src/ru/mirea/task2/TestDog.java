package ru.mirea.lab2;
import java.util.Scanner;

public class TestDog {
    public static void main(String[] args) {

        int i = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число (сколько объектов добавить): ");
        if (sc.hasNextInt()) {
            i = sc.nextInt();
        }
        int age = 0;
        String name = "";
        while (i > 0) {
            System.out.println("Введите возраст собаки: ");
            if (sc.hasNextInt()) {
                age = sc.nextInt();
            }
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Введите кличку собаки: ");
            name = sc1.nextLine();
            Dog d = new Dog(age, name);
            System.out.println(d.toString());
            i -= 1;
        }
        Dog[] dogs = new Dog[i];

    }


}