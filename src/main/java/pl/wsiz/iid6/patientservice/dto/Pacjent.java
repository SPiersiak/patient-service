package pl.wsiz.iid6.patientservice.dto;

import java.util.List;

public class Pacjent extends Osoba {
    private int nrUbezpieczenia;
    private Osoba lekarzRodzinny;// albo string
    private List<Skierowanie> listaSkierowan;
    private List<Badanie> listaBadan;
    private Stan stanZdrowia;
    private List<String> leki;
    private List<Recepta> recepty;

    public Pacjent(String imie, String nazwisko, String miejscowość, String pesel, String nrTelefonu, int nrUbezpieczenia){
        super(imie, nazwisko, miejscowość, pesel, nrTelefonu);
        this.nrUbezpieczenia = nrUbezpieczenia;
    }
}
