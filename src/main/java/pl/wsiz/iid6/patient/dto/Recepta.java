package pl.wsiz.iid6.patient.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity(name = "recepta")
public class Recepta
{
    @Id
    @GeneratedValue
    private String pesel;
    private Date data_Waznosci;
    private String Lekarz;
    private Date data_wystawienia;

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Date getData_Waznosci() {
        return data_Waznosci;
    }

    public void setData_Waznosci(Date data_Waznosci) {
        this.data_Waznosci = data_Waznosci;
    }

    public String getLekarz() {
        return Lekarz;
    }

    public void setLekarz(String lekarz) {
        Lekarz = lekarz;
    }

    public Date getData_wystawienia() {
        return data_wystawienia;
    }

    public void setData_wystawienia(Date data_wystawienia) {
        this.data_wystawienia = data_wystawienia;
    }
}
