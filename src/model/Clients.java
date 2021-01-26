package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Clients {
    private int idClient;
    private String nameClient;
    private String telephoneNumber;
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
    @Column(name = "nameClient")
    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    @Basic
    @Column(name = "telephoneNumber")
    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
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

        Clients clients = (Clients) o;

        if (idClient != clients.idClient) return false;
        if (nameClient != null ? !nameClient.equals(clients.nameClient) : clients.nameClient != null) return false;
        if (telephoneNumber != null ? !telephoneNumber.equals(clients.telephoneNumber) : clients.telephoneNumber != null)
            return false;
        if (emailClient != null ? !emailClient.equals(clients.emailClient) : clients.emailClient != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idClient;
        result = 31 * result + (nameClient != null ? nameClient.hashCode() : 0);
        result = 31 * result + (telephoneNumber != null ? telephoneNumber.hashCode() : 0);
        result = 31 * result + (emailClient != null ? emailClient.hashCode() : 0);
        return result;
    }
}
