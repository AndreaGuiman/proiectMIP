package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
    private int idBook;
    private String bookName;
    private String bookGenre;

    @Id
    @Column(name = "idBook")
    public int getIdBook() {
        return idBook;
    }

    public void setIdBook(int idBook) {
        this.idBook = idBook;
    }

    @Basic
    @Column(name = "bookName")
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Basic
    @Column(name = "bookGenre")
    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Books books = (Books) o;

        if (idBook != books.idBook) return false;
        if (bookName != null ? !bookName.equals(books.bookName) : books.bookName != null) return false;
        if (bookGenre != null ? !bookGenre.equals(books.bookGenre) : books.bookGenre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBook;
        result = 31 * result + (bookName != null ? bookName.hashCode() : 0);
        result = 31 * result + (bookGenre != null ? bookGenre.hashCode() : 0);
        return result;
    }
}
