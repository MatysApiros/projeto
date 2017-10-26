package br.com.matysapiros.bookchooser.dados;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DatabaseManagement {
    private Connection connection;

    public DatabaseManagement() {
        this.connection = DatabaseConnetion.getConexao();
    }

    public boolean insertBookGenre(int bookID, int genreID){
        String sql = "insert into books_and_genres (book_id,genre_id) values(?,?);";
        try{
            PreparedStatement statementmt = connection.prepareStatement(sql);
            statementmt.setString(1, String.valueOf(bookID));
            statementmt.setString(2, String.valueOf(genreID));
            statementmt.execute();
            statementmt.close();
            return true;
        }catch (SQLException excption){
            throw new RuntimeException(excption);
        }
    }

    public boolean insertBookType(int bookID, int typeID){
        String sql = "insert into books_and_types (book_id,type_id) values(?,?);";
        try{
            PreparedStatement statementmt = connection.prepareStatement(sql);
            statementmt.setString(1, String.valueOf(bookID));
            statementmt.setString(2, String.valueOf(typeID));
            statementmt.execute();
            statementmt.close();
            return true;
        }catch (SQLException excption){
            throw new RuntimeException(excption);
        }
    }
}
