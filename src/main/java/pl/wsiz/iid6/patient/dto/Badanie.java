package pl.wsiz.iid6.patient.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "badanie")
public class Badanie
{
    @Id
    @GeneratedValue
    private Long id;
    private String typ;
    private String opis;
    private String pesel;
    private Date data_badania;
    private String lekarz;
    private String godnosc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTyp() {
        return typ;
    }

    public void setTyp(String typ) {
        this.typ = typ;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Date getData_badania() {
        return data_badania;
    }

    public void setData_badania(Date data_badania) {
        this.data_badania = data_badania;
    }

    public String getLekarz() {
        return lekarz;
    }

    public void setLekarz(String lekarz) {
        this.lekarz = lekarz;
    }

    public String getGodnosc() {
        return godnosc;
    }

    public void setGodnosc(String godnosc) {
        this.godnosc = godnosc;
    }
}
