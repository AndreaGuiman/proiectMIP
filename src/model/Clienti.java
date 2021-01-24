package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Clienti {
    private int idClient;
    private String numeClient;
    private String telefonClient;
    private String emailClient;

    @Id
    @Column(name = "idClient")
    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    @Basic
    @Column(name = "numeClient")
    public String getNumeClient() {
        return numeClient;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    @Basic
    @Column(name = "telefonClient")
    public String getTelefonClient() {
        return telefonClient;
    }

    public void setTelefonClient(String telefonClient) {
        this.telefonClient = telefonClient;
    }

    @Basic
    @Column(name = "emailClient")
    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Clienti clienti = (Clienti) o;
        return idClient == clienti.idClient && Objects.equals(numeClient, clienti.numeClient) && Objects.equals(telefonClient, clienti.telefonClient) && Objects.equals(emailClient, clienti.emailClient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idClient, numeClient, telefonClient, emailClient);
    }
}
