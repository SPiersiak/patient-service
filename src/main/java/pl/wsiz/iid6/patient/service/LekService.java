package pl.wsiz.iid6.patient.service;

import  org.springframework.stereotype.Service;
import pl.wsiz.iid6.patient.dto.Lek;

@Service
public class LekService
{
    private Lek[] leki = {
            new Lek("Ibuprom", "Sanofi"),
            new Lek("szczepionka", "Astra"),
            new Lek("Paracetamol", "Polfa")};

    public Lek findLek(String nazwa)
    {
        Lek finded = new Lek("", "");

        for(Lek lek: leki)
        {
            if (lek.getNazwa().equals(nazwa))
            {
                finded = lek;
            }
        }
        return finded;
    }
}

