package ru.mirea.lab2;

public class Dog {
    int age;
    String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }

    public double ageDogToAgeHuman(int age) {
        return age * 7;
    }

}