package pl.wsiz.iid6.patient.entity;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;


@Entity(name = "patient")//domyślnie jest jak klasa!
public class PatientEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String imie;
    private String nazwisko;
    private String miejscowosc;
    private String kod;
    private String ulica;
    private String pesel;
    private String dataUrodzenia;
    private String mail;
    private String nrTelefonu;
    private String plec;
    protected PatientEntity() {}

    public PatientEntity(Long id, String imie, String nazwisko, String miejscowosc, String kod, String ulica, String pesel, String dataUrodzenia, String mail, String nrTelefonu, String plec) {
        this.id = id;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
        this.kod = kod;
        this.ulica = ulica;
        this.pesel = pesel;
        this.dataUrodzenia = dataUrodzenia;
        this.mail = mail;
        this.nrTelefonu = nrTelefonu;
        this.plec = plec;
    }

    public PatientEntity(String imie, String nazwisko, String miejscowosc, String kod, String ulica, String pesel, String dataUrodzenia, String mail, String nrTelefonu, String plec) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
        this.kod = kod;
        this.ulica = ulica;
        this.pesel = pesel;
        this.dataUrodzenia = dataUrodzenia;
        this.mail = mail;
        this.nrTelefonu = nrTelefonu;
        this.plec = plec;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public void setMiejscowosc(String miejscowosc) {
        this.miejscowosc = miejscowosc;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public void setNrTelefonu(String nrTelefonu) {
        this.nrTelefonu = nrTelefonu;
    }

    public String getPlec() {
        return plec;
    }

    public void setPlec(String plec) {
        this.plec = plec;
    }
}