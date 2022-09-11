package ru.mirea.task1;
import java.util.Random;
import java.util.random.RandomGenerator;

public class ex4 {
    public static void main(String[] args) {

        System.out.println("Задание номер 4");

        System.out.println("Массив методом - Math.random");

        int array[] = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int)(Math.random() * 10001) - 5000);
            System.out.println(array[i]);
        }

        System.out.println("Сортировка по возрастанию Math.random:");

        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int min_i = i; // обознаем первый элем как минимальный
            for (int j = i+1; j < array.length; j++) {
                //Если находим элемент меньше, запоминаем его индекс
                if (array[j] < min) {
                    min = array[j];
                    min_i = j;
                }
            }
            //меняем местами если нашли элем меньше текущего
            if (i != min_i) {
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
            System.out.println(array[i]);
        }


        System.out.println("Массив методом - Random()");
        Random generator = new Random();
        int array2[] = new int[5];
        for (int i = 0; i < array2.length; i++) {
            array2[i] = generator.nextInt();
            System.out.println(array2[i]);
        }

        System.out.println("Сортировка по возрастанию Random():");

        for (int i = 0; i < array2.length; i++) {
            int min = array2[i];
            int min_i = i; // обознаем первый элем как минимальный
            for (int j = i+1; j < array2.length; j++) {
                //Если находим элемент меньше, запоминаем его индекс
                if (array2[j] < min) {
                    min = array2[j];
                    min_i = j;
                }
            }
            //меняем местами если нашли элем меньше текущего
            if (i != min_i) {
                int tmp = array2[i];
                array2[i] = array2[min_i];
                array2[min_i] = tmp;
            }
            System.out.println(array2[i]);
        }

    }
}