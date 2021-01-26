package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Requests {
    private int idRequest;
    private Integer idClient;
    private Integer idBook;
    private Date startDate;
    private Date endDate;

    @Id
    @Column(name = "idRequest")
    public int getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(int idRequest) {
        this.idRequest = idRequest;
    }

    @Basic
    @Column(name = "idClient")
    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
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
    @Column(name = "startDate")
    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Basic
    @Column(name = "endDate")
    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Requests requests = (Requests) o;

        if (idRequest != requests.idRequest) return false;
        if (idClient != null ? !idClient.equals(requests.idClient) : requests.idClient != null) return false;
        if (idBook != null ? !idBook.equals(requests.idBook) : requests.idBook != null) return false;
        if (startDate != null ? !startDate.equals(requests.startDate) : requests.startDate != null) return false;
        if (endDate != null ? !endDate.equals(requests.endDate) : requests.endDate != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idRequest;
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        result = 31 * result + (idBook != null ? idBook.hashCode() : 0);
        result = 31 * result + (startDate != null ? startDate.hashCode() : 0);
        result = 31 * result + (endDate != null ? endDate.hashCode() : 0);
        return result;
    }
}
