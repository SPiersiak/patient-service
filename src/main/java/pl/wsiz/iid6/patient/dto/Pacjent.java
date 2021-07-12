package pl.wsiz.iid6.patient.dto;

import java.util.Date;
import java.util.List;

public class Pacjent extends Osoba
{
    private int nrUbezpieczenia;
    private Osoba lekarzRodzinny;// albo string
    private List<Skierowanie> listaSkierowan;
    private List<Badanie> listaBadan;
    private Stan stanZdrowia;
    private List<String> leki;
    private List<Recepta> recepty;

    public Pacjent(String imie, String nazwisko, String miejscowosc, String kod, String ulica, String pesel, String dataUrodzenia, String mail, String nrTelefonu, String plec)
    {
        super(imie, nazwisko, miejscowosc, kod, ulica, pesel, dataUrodzenia, mail, nrTelefonu, plec);
    }

    public Pacjent() {
        super();
    }
}
