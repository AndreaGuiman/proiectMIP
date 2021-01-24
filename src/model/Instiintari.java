package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Instiintari {
    private int idInstiintare;
    private Integer idCerere;

    @Id
    @Column(name = "idInstiintare")
    public int getIdInstiintare() {
        return idInstiintare;
    }

    public void setIdInstiintare(int idInstiintare) {
        this.idInstiintare = idInstiintare;
    }

    @Basic
    @Column(name = "idCerere")
    public Integer getIdCerere() {
        return idCerere;
    }

    public void setIdCerere(Integer idCerere) {
        this.idCerere = idCerere;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Instiintari that = (Instiintari) o;
        return idInstiintare == that.idInstiintare && Objects.equals(idCerere, that.idCerere);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idInstiintare, idCerere);
    }
}
