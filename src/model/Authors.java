package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Authors {
    private int idAuthor;
    private String authorName;

    @Id
    @Column(name = "idAuthor")
    public int getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(int idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Basic
    @Column(name = "authorName")
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Authors authors = (Authors) o;

        if (idAuthor != authors.idAuthor) return false;
        if (authorName != null ? !authorName.equals(authors.authorName) : authors.authorName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idAuthor;
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        return result;
    }
}
