package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Istoric {
    private int idIstoric;
    private Integer idCarte;
    private Integer idClient;

    @Id
    @Column(name = "idIstoric")
    public int getIdIstoric() {
        return idIstoric;
    }

    public void setIdIstoric(int idIstoric) {
        this.idIstoric = idIstoric;
    }

    @Basic
    @Column(name = "idCarte")
    public Integer getIdCarte() {
        return idCarte;
    }

    public void setIdCarte(Integer idCarte) {
        this.idCarte = idCarte;
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
        Istoric istoric = (Istoric) o;
        return idIstoric == istoric.idIstoric && Objects.equals(idCarte, istoric.idCarte) && Objects.equals(idClient, istoric.idClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idIstoric, idCarte, idClient);
    }
}
