package model;

import javax.persistence.*;

@Entity
@Table(name = "booksauthors", schema = "proiectdb")
public class BooksAuthors {
    private int idBa;
    private Integer idBook;
    private Integer idAuthor;

    @Id
    @Column(name = "idBA")
    public int getIdBa() {
        return idBa;
    }

    public void setIdBa(int idBa) {
        this.idBa = idBa;
    }

    @Basic
    @Column(name = "idBook")
    public Integer getIdBook() {
        return idBook;
    }

    public void setIdBook(Integer idBook) {
        this.idBook = idBook;
    }

    @Basic
    @Column(name = "idAuthor")
    public Integer getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BooksAuthors that = (BooksAuthors) o;

        if (idBa != that.idBa) return false;
        if (idBook != null ? !idBook.equals(that.idBook) : that.idBook != null) return false;
        if (idAuthor != null ? !idAuthor.equals(that.idAuthor) : that.idAuthor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBa;
        result = 31 * result + (idBook != null ? idBook.hashCode() : 0);
        result = 31 * result + (idAuthor != null ? idAuthor.hashCode() : 0);
        return result;
    }
}
