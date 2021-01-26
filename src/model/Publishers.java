package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Publishers {
    private int idPublisher;
    private String namePublisher;
    private String addressPublisher;
    private String telephonePublisher;
    private String emailPublisher;

    @Id
    @Column(name = "idPublisher")
    public int getIdPublisher() {
        return idPublisher;
    }

    public void setIdPublisher(int idPublisher) {
        this.idPublisher = idPublisher;
    }

    @Basic
    @Column(name = "namePublisher")
    public String getNamePublisher() {
        return namePublisher;
    }

    public void setNamePublisher(String namePublisher) {
        this.namePublisher = namePublisher;
    }

    @Basic
    @Column(name = "addressPublisher")
    public String getAddressPublisher() {
        return addressPublisher;
    }

    public void setAddressPublisher(String addressPublisher) {
        this.addressPublisher = addressPublisher;
    }

    @Basic
    @Column(name = "telephonePublisher")
    public String getTelephonePublisher() {
        return telephonePublisher;
    }

    public void setTelephonePublisher(String telephonePublisher) {
        this.telephonePublisher = telephonePublisher;
    }

    @Basic
    @Column(name = "emailPublisher")
    public String getEmailPublisher() {
        return emailPublisher;
    }

    public void setEmailPublisher(String emailPublisher) {
        this.emailPublisher = emailPublisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publishers that = (Publishers) o;

        if (idPublisher != that.idPublisher) return false;
        if (namePublisher != null ? !namePublisher.equals(that.namePublisher) : that.namePublisher != null)
            return false;
        if (addressPublisher != null ? !addressPublisher.equals(that.addressPublisher) : that.addressPublisher != null)
            return false;
        if (telephonePublisher != null ? !telephonePublisher.equals(that.telephonePublisher) : that.telephonePublisher != null)
            return false;
        if (emailPublisher != null ? !emailPublisher.equals(that.emailPublisher) : that.emailPublisher != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPublisher;
        result = 31 * result + (namePublisher != null ? namePublisher.hashCode() : 0);
        result = 31 * result + (addressPublisher != null ? addressPublisher.hashCode() : 0);
        result = 31 * result + (telephonePublisher != null ? telephonePublisher.hashCode() : 0);
        result = 31 * result + (emailPublisher != null ? emailPublisher.hashCode() : 0);
        return result;
    }
}
