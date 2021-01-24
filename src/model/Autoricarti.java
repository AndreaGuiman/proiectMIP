package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Autoricarti {
    private int idAc;
    private Integer idAutor;
    private Integer idCarte;

    @Id
    @Column(name = "idAC")
    public int getIdAc() {
        return idAc;
    }

    public void setIdAc(int idAc) {
        this.idAc = idAc;
    }

    @Basic
    @Column(name = "idAutor")
    public Integer getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Integer idAutor) {
        this.idAutor = idAutor;
    }

    @Basic
    @Column(name = "idCarte")
    public Integer getIdCarte() {
        return idCarte;
    }

    public void setIdCarte(Integer idCarte) {
        this.idCarte = idCarte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Autoricarti that = (Autoricarti) o;
        return idAc == that.idAc && Objects.equals(idAutor, that.idAutor) && Objects.equals(idCarte, that.idCarte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idAc, idAutor, idCarte);
    }
}
