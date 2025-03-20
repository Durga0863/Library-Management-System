package com.library;
import java.sql.*;
public class LibraryDbOperations {

    public static void addbook(com.library.Book book){
        String sql =  "INSERT INTO Books (title, author, genre, year, quantity) VALUES (?, ?, ?, ?, ?)";
        try
            (Connection conn = com.library.DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)){

            stmt.setString(1, book.getTitle());
            stmt.setString(2, book.getAuthor());
            stmt.setString(3, book.getGenre());
            stmt.setInt(4, book.getYear());
            stmt.setInt(5, book.getQuantity());

            stmt.executeUpdate();
            System.out.println("Book added succesfully");

            ResultSet res = stmt.executeQuery("select  * from books");
            while (res.next()){
                System.out.println(res.getInt(1)+" "+res.getString(2)+" "+res.getString(3)+" "+res.getInt(4)+" "+res.getString(5)+" "+res.getInt(6)+" "+res.getInt(7));
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
