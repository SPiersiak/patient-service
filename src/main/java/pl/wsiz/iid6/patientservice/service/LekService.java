package pl.wsiz.iid6.patientservice.service;

import org.springframework.stereotype.Service;
import pl.wsiz.iid6.patientservice.dto.Lek;

@Service
public class LekService {
    private Lek[] leki = {new Lek("Ibuprom", "Sanofi"),
    new Lek("szczepionka","Astra"),
    new Lek("Paracetamol", "polfa")};

    public Lek findLek(String nazwa){
        for(Lek lek: leki){
            if(lek.getNazwa().equals(nazwa)){
                return lek;
            }
        }
        return new Lek(nazwa);
    }
}
