package pl.wsiz.iid6.patient.dto;

import java.util.Date;

public class Osoba
{
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

    public Osoba(String imie, String nazwisko, String miejscowosc, String kod, String ulica, String pesel, String dataUrodzenia, String mail, String nrTelefonu, String plec)
    {
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

    public Osoba() {
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

    public int getWiek()
    {
        // wyznczamy wiek Rok obecny - rok urodzenia
        int wiek = 20;
        return wiek;
    }

    public boolean checkEmail()
    {
        // czy poprwany, czy zawiera @
        return true;
    }

    public boolean checkPesel()
    {
        // 12.05.01 -> 01 05 31.....
        //             01 05+20 31
        return true;
    }
}
