package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Cereri {
    private int idCerere;
    private Integer idClient;
    private Integer idCarte;
    private Date dataImprumut;
    private Date dataPredare;

    @Id
    @Column(name = "idCerere")
    public int getIdCerere() {
        return idCerere;
    }

    public void setIdCerere(int idCerere) {
        this.idCerere = idCerere;
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
    @Column(name = "idCarte")
    public Integer getIdCarte() {
        return idCarte;
    }

    public void setIdCarte(Integer idCarte) {
        this.idCarte = idCarte;
    }

    @Basic
    @Column(name = "dataImprumut")
    public Date getDataImprumut() {
        return dataImprumut;
    }

    public void setDataImprumut(Date dataImprumut) {
        this.dataImprumut = dataImprumut;
    }

    @Basic
    @Column(name = "dataPredare")
    public Date getDataPredare() {
        return dataPredare;
    }

    public void setDataPredare(Date dataPredare) {
        this.dataPredare = dataPredare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cereri cereri = (Cereri) o;
        return idCerere == cereri.idCerere && Objects.equals(idClient, cereri.idClient) && Objects.equals(idCarte, cereri.idCarte) && Objects.equals(dataImprumut, cereri.dataImprumut) && Objects.equals(dataPredare, cereri.dataPredare);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCerere, idClient, idCarte, dataImprumut, dataPredare);
    }
}
