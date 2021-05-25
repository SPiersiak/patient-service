package pl.wsiz.iid6.patientservice.dto;

import java.util.Date;

public class Badanie {
    private Date data;
    private String opis;
    private String rodzajBadania;
    private Osoba lekarz;
    private String miejsceBadania;

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getRodzajBadania() {
        return rodzajBadania;
    }

    public void setRodzajBadania(String rodzajBadania) {
        this.rodzajBadania = rodzajBadania;
    }

    public Osoba getLekarz() {
        return lekarz;
    }

    public void setLekarz(Osoba lekarz) {
        this.lekarz = lekarz;
    }

    public String getMiejsceBadania() {
        return miejsceBadania;
    }

    public void setMiejsceBadania(String miejsceBadania) {
        this.miejsceBadania = miejsceBadania;
    }
}
