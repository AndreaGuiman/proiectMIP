package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Utilizatori {
    private int idUtilizator;
    private Integer idBibliotecar;
    private Integer idClient;
    private String username;
    private String password;

    @Id
    @Column(name = "idUtilizator")
    public int getIdUtilizator() {
        return idUtilizator;
    }

    public void setIdUtilizator(int idUtilizator) {
        this.idUtilizator = idUtilizator;
    }

    @Basic
    @Column(name = "idBibliotecar")
    public Integer getIdBibliotecar() {
        return idBibliotecar;
    }

    public void setIdBibliotecar(Integer idBibliotecar) {
        this.idBibliotecar = idBibliotecar;
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
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Utilizatori that = (Utilizatori) o;
        return idUtilizator == that.idUtilizator && Objects.equals(idBibliotecar, that.idBibliotecar) && Objects.equals(idClient, that.idClient) && Objects.equals(username, that.username) && Objects.equals(password, that.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUtilizator, idBibliotecar, idClient, username, password);
    }
}
