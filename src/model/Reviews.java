package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reviews {
    private int idReview;
    private String reviewText;
    private Integer idBook;
    private Integer idClient;

    @Id
    @Column(name = "idReview")
    public int getIdReview() {
        return idReview;
    }

    public void setIdReview(int idReview) {
        this.idReview = idReview;
    }

    @Basic
    @Column(name = "reviewText")
    public String getReviewText() {
        return reviewText;
    }

    public void setReviewText(String reviewText) {
        this.reviewText = reviewText;
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

        Reviews reviews = (Reviews) o;

        if (idReview != reviews.idReview) return false;
        if (reviewText != null ? !reviewText.equals(reviews.reviewText) : reviews.reviewText != null) return false;
        if (idBook != null ? !idBook.equals(reviews.idBook) : reviews.idBook != null) return false;
        if (idClient != null ? !idClient.equals(reviews.idClient) : reviews.idClient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idReview;
        result = 31 * result + (reviewText != null ? reviewText.hashCode() : 0);
        result = 31 * result + (idBook != null ? idBook.hashCode() : 0);
        result = 31 * result + (idClient != null ? idClient.hashCode() : 0);
        return result;
    }
}
