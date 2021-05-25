package pl.wsiz.iid6.patientservice.dto;

public class Lek {
    private String nazwa;

    public Lek(String nazwa) {
        this.nazwa = nazwa;
    }

    private double cena;
    private boolean czyNaRecepte;
    private String producent;

    public Lek(String nazwa, String producent) {
        this.nazwa = nazwa;
        this.producent = producent;
    }

    public String getNazwa(){
        return nazwa;
    }
}
