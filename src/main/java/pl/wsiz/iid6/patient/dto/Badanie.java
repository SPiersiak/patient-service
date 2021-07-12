package pl.wsiz.iid6.patient.dto;

public class Badanie
{
    private String typBadania;
    private String opis;

    public Badanie(String typBadania, String opis)
    {
        this.typBadania = typBadania;
        this.opis = opis;
    }

    public String getTypBadania()
    {
        return typBadania;
    }

    public void setTypBadania(String typBadania)
    {
        this.typBadania = typBadania;
    }

    public String getOpis()
    {
        return opis;
    }

    public void setOpis(String opis)
    {
        this.opis = opis;
    }
}
