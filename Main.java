package com.library;

public class Main {
    public static void main(String[] args) {
//        DatabaseConnection dc = new DatabaseConnection();
//        dc.getConnection();

        com.library.Book newBook = new com.library.Book();
        newBook.setTitle("The Great Gatsby");
        newBook.setAuthor("F. Scott Fitzgerald");
        newBook.setGenre("Fiction");
        newBook.setYear(1925);

        com.library.Book newBook1 = new com.library.Book();
        newBook.setTitle("The Great Ga");
        newBook.setAuthor("F. Scott Fit");
        newBook.setGenre("Fiction");
        newBook.setYear(1926);





        com.library.LibraryDbOperations.addbook(newBook);



    }
}
