package ru.mirea.task4;

public class TestAuthor {
    public static void main(String[] args) {
        Author a0 = new Author("Igor", "djskfkjskjfksjfd@mail.ru", 'M');
        Author a1 = new Author("Ivan", "ivan228@mail.ru", 'U');
        Author a2 = new Author("Katya", "katerina1999@mail.ru", 'F');
        Author a3 = new Author("Alex", "alex1337@mail.ru", 'M');

        a0.setEmail("Igor@gmail.com");

        System.out.println(a1.getName());
        System.out.println(a2.getEmail());
        System.out.println(a3.getGender());
        System.out.println(a0);
    }
}