package pl.wsiz.iid6.patient.dto;

public class Lek
{
    private Long id;
    private String nazwa;
    private Integer cena;
    private String producent;

    public Lek(String nazwa, String producent) {
        this.nazwa = nazwa;
        this.producent = producent;
    }

    public Lek(String nazwa, Integer cena, String producent) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.producent = producent;
    }

    public Lek(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public Integer getCena() {
        return cena;
    }

    public void setCena(Integer cena) {
        this.cena = cena;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    @Override
    public String toString() {
        return "Lek: " +
                "nazwa: " + nazwa +
                ", producent: " + producent +
                ", cena: " + cena;
    }
}
