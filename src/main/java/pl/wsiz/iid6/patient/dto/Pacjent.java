package pl.wsiz.iid6.patient.dto;

import java.util.List;

public class Pacjent extends Osoba
{
    private int ID;
    private Osoba lekarzRodzinny;
    private List<Recepta> recepty;
    private List<Lek> leki;
    private List<Badanie> badania;
    private List<Skierowanie> skierowania;

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Osoba getLekarzRodzinny() {
        return lekarzRodzinny;
    }

    public void setLekarzRodzinny(Osoba lekarzRodzinny) {
        this.lekarzRodzinny = lekarzRodzinny;
    }

    public List<Recepta> getRecepty() {
        return recepty;
    }

    public void setRecepty(List<Recepta> recepty) {
        this.recepty = recepty;
    }

    public List<Lek> getLeki() {
        return leki;
    }

    public void setLeki(List<Lek> leki) {
        this.leki = leki;
    }

    public List<Badanie> getBadania() {
        return badania;
    }

    public void setBadania(List<Badanie> badania) {
        this.badania = badania;
    }

    public List<Skierowanie> getSkierowania() {
        return skierowania;
    }

    public void setSkierowania(List<Skierowanie> skierowania) {
        this.skierowania = skierowania;
    }

    public Pacjent(String pesel){
        super (pesel);
    }

    public Pacjent(String imie, String nazwisko) {
        super(imie, nazwisko);
    }

    @Override
    public String toString() {
        return "Imie: " +getImie()+ ", Nazwisko: "+ getNazwisko() + ", Pesel: " + getPesel()+ ", Miejscowosc: " + getMiejscowosc() + " " +
                ", Lekarz rodzinny: " + lekarzRodzinny +
                ", Skierowania: " + skierowania +
                ", Badania: " + badania +
                ", Leki: " + leki +
                ", Recepty: " + recepty;
    }

    public Pacjent(String imie, String nazwisko, String pesel, String miejscowosc){
        super(imie, nazwisko, pesel, miejscowosc);
    }

    public Pacjent(String imie, String nazwisko, String miejscowosc, String nrTelefonu, String pesel) {
        super(imie, nazwisko, miejscowosc, nrTelefonu, pesel);
    }
}
