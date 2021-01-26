package model;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Reminders {
    private int idReminder;
    private Integer idRequest;

    @Id
    @Column(name = "idReminder")
    public int getIdReminder() {
        return idReminder;
    }

    public void setIdReminder(int idReminder) {
        this.idReminder = idReminder;
    }

    @Basic
    @Column(name = "idRequest")
    public Integer getIdRequest() {
        return idRequest;
    }

    public void setIdRequest(Integer idRequest) {
        this.idRequest = idRequest;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Reminders reminders = (Reminders) o;

        if (idReminder != reminders.idReminder) return false;
        if (idRequest != null ? !idRequest.equals(reminders.idRequest) : reminders.idRequest != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idReminder;
        result = 31 * result + (idRequest != null ? idRequest.hashCode() : 0);
        return result;
    }
}
