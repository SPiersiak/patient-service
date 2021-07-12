package pl.wsiz.iid6.patient.dto;

public class Lek
{
    private String nazwa;
    private String producent;

    public Lek(String nazwa, String producent)
    {
        this.nazwa = nazwa;
        this.producent = producent;
    }

    public String getProducent()
    {
        return producent;
    }

    public String getNazwa()
    {
        return nazwa;
    }

    @Override
    public String toString()
    {
        return "Lek{" +
                "nazwa='" + nazwa + '\'' +
                ", producent='" + producent + '\'' +
                '}';
    }
}
