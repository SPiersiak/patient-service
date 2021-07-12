package pl.wsiz.iid6.patient.dto;

import java.util.Date;
import java.util.List;

public class Recepta
{
    private String peselPacjenta;
    private Date dataWaznosci;
    private List<Lek> listaLekow;

    public Recepta(String peselPacjenta, Date dataWaznosci, List<Lek> listaLekow)
    {
        this.peselPacjenta = peselPacjenta;
        this.dataWaznosci = dataWaznosci;
        this.listaLekow = listaLekow;
    }

    public List<Lek> getListaLekow() {
        return listaLekow;
    }

    public List<Lek> obtainListaLekow(String pesel, int ID) {
        // if dataWaznosci<dataDzisiaj
        return listaLekow;
        //else
        //return null;
    }
}
