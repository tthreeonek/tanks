package ru.mirea.task4;


// final вместе с исключениями можно в общем то и удалить ¯\_(ツ)_/¯
public class Author {
    private final String name;
    private String email;
    private final char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = Character.toUpperCase(gender);
    }


    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public char getGender() {
        return gender;
    }
    //System.out.format("%s, в следующем году вам будет %d", "Джон", 23);
    public String toString() {
        return String.format("Author - %s(%s), email - %s",name ,gender, email);
    }
}
