package pl.wsiz.iid6.patient.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "patient")//domyślnie jest jak klasa!
public class PatientEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String pesel;
    private String miejscowosc;

    protected PatientEntity() {
    }

    public PatientEntity(String firstName, String lastName, String pesel, String miejscowosc) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.miejscowosc = miejscowosc;
    }

    @Override
    public String toString() {
        return String.format(
                "Patient[id=%d, firstName='%s', lastName='%s', pesel='%s', miejscowosc='%s']",
                id, firstName, lastName, pesel, miejscowosc);
    }

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }
}