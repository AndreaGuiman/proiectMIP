package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class History {
    private int idHistory;
    private Integer idBook;
    private Integer idClient;

    @Id
    @Column(name = "idHistory")
    public int getIdHistory() {
        return idHistory;
    }

    public void setIdHistory(int idHistory) {
        this.idHistory = idHistory;
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
    @Column(name = "idClient")
    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        History history = (History) o;

        if (idHistory != history.idHistory) return false;
        if (idBook != null ? !idBook.equals(history.idBook) : history.idBook != null) return false;
        if (idClient != null ? !idClient.equals(history.idClient) : history.idClient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idHistory;
        result = 31 * result + (idBook != null ? idBook.hashCode() : 0);
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        return result;
    }
}
