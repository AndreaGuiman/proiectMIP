package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Carti {
    private int idCarte;
    private String numeCarte;
    private String genCarte;

    @Id
    @Column(name = "idCarte")
    public int getIdCarte() {
        return idCarte;
    }

    public void setIdCarte(int idCarte) {
        this.idCarte = idCarte;
    }

    @Basic
    @Column(name = "numeCarte")
    public String getNumeCarte() {
        return numeCarte;
    }

    public void setNumeCarte(String numeCarte) {
        this.numeCarte = numeCarte;
    }

    @Basic
    @Column(name = "genCarte")
    public String getGenCarte() {
        return genCarte;
    }

    public void setGenCarte(String genCarte) {
        this.genCarte = genCarte;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carti carti = (Carti) o;
        return idCarte == carti.idCarte && Objects.equals(numeCarte, carti.numeCarte) && Objects.equals(genCarte, carti.genCarte);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCarte, numeCarte, genCarte);
    }
}
