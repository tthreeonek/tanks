package ru.mirea.task3;

public class Book {
    private String title;
    private String author;
    private int publish_year;

    public Book(){
        title = "SimpleTitle";
        author = "SimpleAuthor";
        publish_year = 1970;
    }
    public Book(String title, String author, int publish_year){
        this.title = title;
        this.author = author;
        this.publish_year = publish_year;
    }


    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setPublish_year(int publish_year){
        this.publish_year = publish_year;
    }

    public String toString(){
        return  "\nTitle: "+this.title+
                ";\nAuthor: "+this.author+
                ";\nPublish year: "+this.publish_year + '.';
    }
}
