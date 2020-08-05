package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book[] books = new Book[4];
        Book book1 = new Book("Three", 220);
        Book book2 = new Book("Silent Scream", 410);
        Book book3 = new Book("The Martian", 355);
        Book book4 = new Book("Clean code", 305);
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getTitle() + " - " + books[index].getNumberOfPages());
        }
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            System.out.println(books[index].getTitle() + " - " + books[index].getNumberOfPages());
        }
        System.out.println();
        for (int index = 0; index < books.length; index++) {
            if (books[index].getTitle().equals("Clean code")) {
                System.out.println(books[index].getTitle() + " - " + books[index].getNumberOfPages());
            }
        }
    }
}
