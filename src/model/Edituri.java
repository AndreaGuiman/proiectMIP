package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Edituri {
    private int idEditura;
    private String numeEditura;
    private String adresaEditura;
    private String telefonEditura;
    private String emailEditura;

    @Id
    @Column(name = "idEditura")
    public int getIdEditura() {
        return idEditura;
    }

    public void setIdEditura(int idEditura) {
        this.idEditura = idEditura;
    }

    @Basic
    @Column(name = "numeEditura")
    public String getNumeEditura() {
        return numeEditura;
    }

    public void setNumeEditura(String numeEditura) {
        this.numeEditura = numeEditura;
    }

    @Basic
    @Column(name = "adresaEditura")
    public String getAdresaEditura() {
        return adresaEditura;
    }

    public void setAdresaEditura(String adresaEditura) {
        this.adresaEditura = adresaEditura;
    }

    @Basic
    @Column(name = "telefonEditura")
    public String getTelefonEditura() {
        return telefonEditura;
    }

    public void setTelefonEditura(String telefonEditura) {
        this.telefonEditura = telefonEditura;
    }

    @Basic
    @Column(name = "emailEditura")
    public String getEmailEditura() {
        return emailEditura;
    }

    public void setEmailEditura(String emailEditura) {
        this.emailEditura = emailEditura;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Edituri edituri = (Edituri) o;
        return idEditura == edituri.idEditura && Objects.equals(numeEditura, edituri.numeEditura) && Objects.equals(adresaEditura, edituri.adresaEditura) && Objects.equals(telefonEditura, edituri.telefonEditura) && Objects.equals(emailEditura, edituri.emailEditura);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEditura, numeEditura, adresaEditura, telefonEditura, emailEditura);
    }
}
