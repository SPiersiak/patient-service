package pl.wsiz.iid6.patient.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "skierowanie")
public class Skierowanie
{
    @Id
    @GeneratedValue
    public Long id;
    public String lekarz;
    public Date data_wystawienia;
    public String Opis;

    public Skierowanie() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLekarz() {
        return lekarz;
    }

    public void setLekarz(String lekarz) {
        this.lekarz = lekarz;
    }

    public Date getDataWystawienia() {
        return data_wystawienia;
    }

    public void setDataWystawienia(Date dataWystawienia) {
        this.data_wystawienia = dataWystawienia;
    }

    public String getOpis() {
        return Opis;
    }

    public void setOpis(String opis) {
        Opis = opis;
    }
}
