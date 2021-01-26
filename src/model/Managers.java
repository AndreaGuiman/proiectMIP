package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Managers {
    private int idManager;
    private String nameManager;
    private String telephoneNumber;
    private String emailManager;

    @Id
    @Column(name = "idManager")
    public int getIdManager() {
        return idManager;
    }

    public void setIdManager(int idManager) {
        this.idManager = idManager;
    }

    @Basic
    @Column(name = "nameManager")
    public String getNameManager() {
        return nameManager;
    }

    public void setNameManager(String nameManager) {
        this.nameManager = nameManager;
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
    @Column(name = "emailManager")
    public String getEmailManager() {
        return emailManager;
    }

    public void setEmailManager(String emailManager) {
        this.emailManager = emailManager;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Managers managers = (Managers) o;

        if (idManager != managers.idManager) return false;
        if (nameManager != null ? !nameManager.equals(managers.nameManager) : managers.nameManager != null)
            return false;
        if (telephoneNumber != null ? !telephoneNumber.equals(managers.telephoneNumber) : managers.telephoneNumber != null)
            return false;
        if (emailManager != null ? !emailManager.equals(managers.emailManager) : managers.emailManager != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idManager;
        result = 31 * result + (nameManager != null ? nameManager.hashCode() : 0);
        result = 31 * result + (telephoneNumber != null ? telephoneNumber.hashCode() : 0);
        result = 31 * result + (emailManager != null ? emailManager.hashCode() : 0);
        return result;
    }
}
