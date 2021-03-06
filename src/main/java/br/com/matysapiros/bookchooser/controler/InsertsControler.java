package br.com.matysapiros.bookchooser.controler;

import br.com.matysapiros.bookchooser.database.BookDAO;
import br.com.matysapiros.bookchooser.database.GenreDAO;
import br.com.matysapiros.bookchooser.model.Book;

public class InsertsControler{

    private BookDAO bookDAO = new BookDAO();
    private GenreDAO genreDAO = new GenreDAO();

    public boolean insertBook(Book book){
        bookDAO.insertBook(book);
        return true;
    }

    public boolean insertBookGenre(int bookId,int genreId){
        genreDAO.insertBookGenre(bookId,genreId);
        return true;
    }

    public boolean insertBookType(int bookId, int typeId){
        bookDAO.insertBookType(bookId,typeId);
        return true;
    }
    
    public boolean updateEvaluation(int bookId, double evaluation){
        bookDAO.updateBookEvaluation(bookId,evaluation);
        return true;
    }

    public boolean deleteBook(int bookId){
        bookDAO.deleteBook(bookId);
        return true;
    }
}
