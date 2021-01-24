package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Bibliotecari {
    private int idBibliotecar;
    private String numeBibliotecar;
    private String telefonBibilotecar;
    private String emailBibliotecar;

    @Id
    @Column(name = "idBibliotecar")
    public int getIdBibliotecar() {
        return idBibliotecar;
    }

    public void setIdBibliotecar(int idBibliotecar) {
        this.idBibliotecar = idBibliotecar;
    }

    @Basic
    @Column(name = "numeBibliotecar")
    public String getNumeBibliotecar() {
        return numeBibliotecar;
    }

    public void setNumeBibliotecar(String numeBibliotecar) {
        this.numeBibliotecar = numeBibliotecar;
    }

    @Basic
    @Column(name = "telefonBibilotecar")
    public String getTelefonBibilotecar() {
        return telefonBibilotecar;
    }

    public void setTelefonBibilotecar(String telefonBibilotecar) {
        this.telefonBibilotecar = telefonBibilotecar;
    }

    @Basic
    @Column(name = "emailBibliotecar")
    public String getEmailBibliotecar() {
        return emailBibliotecar;
    }

    public void setEmailBibliotecar(String emailBibliotecar) {
        this.emailBibliotecar = emailBibliotecar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bibliotecari that = (Bibliotecari) o;
        return idBibliotecar == that.idBibliotecar && Objects.equals(numeBibliotecar, that.numeBibliotecar) && Objects.equals(telefonBibilotecar, that.telefonBibilotecar) && Objects.equals(emailBibliotecar, that.emailBibliotecar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBibliotecar, numeBibliotecar, telefonBibilotecar, emailBibliotecar);
    }
}
