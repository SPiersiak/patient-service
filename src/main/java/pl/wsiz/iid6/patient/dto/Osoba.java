package pl.wsiz.iid6.patient.dto;

import java.util.Date;

public class Osoba
{
    private String imie;
    private String nazwisko;
    private String miejscowosc;
    private String kod;
    private String ulica;
    private String nrTelefonu;
    private String pesel;
    private String imieOjca;
    private String imieMatki;
    private Date dataUrodzenia;

    public Osoba(String imie, String nazwisko, String miejscowosc, String nrTelefonu, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.miejscowosc = miejscowosc;
        this.nrTelefonu = nrTelefonu;
        this.pesel = pesel;
    }

    public int getWiek(){
        // br - rok urodzenia
        int wiek = 20;
        return wiek;
    }

    public boolean checkPesel(){
        // 990512 .... 12.05.2021
        // długość pesel
        return true;
    }

    public Osoba(String imie, String nazwisko, String pesel, String miejscowosc) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
        this.miejscowosc = miejscowosc;
    }

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public Osoba(String pesel) {
        this.pesel = pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public String getMiejscowosc() {
        return miejscowosc;
    }

    public String getKod() {
        return kod;
    }

    public String getUlica() {
        return ulica;
    }

    public String getNrTelefonu() {
        return nrTelefonu;
    }

    public String getPesel() {
        return pesel;
    }

    public String getImieOjca() {
        return imieOjca;
    }

    public String getImieMatki() {
        return imieMatki;
    }

    public Date getDataUrodzenia() {
        return dataUrodzenia;
    }
}
