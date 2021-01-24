package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Edituricarti {
    private int idEc;
    private Integer idEditura;
    private Integer idCarte;

    @Id
    @Column(name = "idEC")
    public int getIdEc() {
        return idEc;
    }

    public void setIdEc(int idEc) {
        this.idEc = idEc;
    }

    @Basic
    @Column(name = "idEditura")
    public Integer getIdEditura() {
        return idEditura;
    }

    public void setIdEditura(Integer idEditura) {
        this.idEditura = idEditura;
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
        Edituricarti that = (Edituricarti) o;
        return idEc == that.idEc && Objects.equals(idEditura, that.idEditura) && Objects.equals(idCarte, that.idCarte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEc, idEditura, idCarte);
    }
}
