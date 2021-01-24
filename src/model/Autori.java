package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Autori {
    private int idAutor;
    private String numeAutor;

    @Id
    @Column(name = "idAutor")
    public int getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(int idAutor) {
        this.idAutor = idAutor;
    }

    @Basic
    @Column(name = "numeAutor")
    public String getNumeAutor() {
        return numeAutor;
    }

    public void setNumeAutor(String numeAutor) {
        this.numeAutor = numeAutor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autori autori = (Autori) o;
        return idAutor == autori.idAutor && Objects.equals(numeAutor, autori.numeAutor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAutor, numeAutor);
    }
}
