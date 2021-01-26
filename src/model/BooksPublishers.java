package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BooksPublishers {
    private int idBp;
    private Integer idBook;
    private Integer idPublisher;

    @Id
    @Column(name = "idBP")
    public int getIdBp() {
        return idBp;
    }

    public void setIdBp(int idBp) {
        this.idBp = idBp;
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
    @Column(name = "idPublisher")
    public Integer getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(Integer idPublisher) {
        this.idPublisher = idPublisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BooksPublishers that = (BooksPublishers) o;

        if (idBp != that.idBp) return false;
        if (idBook != null ? !idBook.equals(that.idBook) : that.idBook != null) return false;
        if (idPublisher != null ? !idPublisher.equals(that.idPublisher) : that.idPublisher != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBp;
        result = 31 * result + (idBook != null ? idBook.hashCode() : 0);
        result = 31 * result + (idPublisher != null ? idPublisher.hashCode() : 0);
        return result;
    }
}
