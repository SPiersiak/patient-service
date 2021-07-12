package pl.wsiz.iid6.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.patient.dto.Badanie;
import pl.wsiz.iid6.patient.dto.Recepta;
import pl.wsiz.iid6.patient.jpa.BadanieRepository;

import java.util.List;

@Service
public class BadanieService {

    @Autowired
    private BadanieRepository badanieRepository;

    public List<Badanie> findByPesel(String pesel){
        List<Badanie> rs = badanieRepository.findByPesel(pesel);
        return rs;
    }

    public List<Badanie> findAll() {
        List<Badanie> rs = badanieRepository.findAll();
        return rs;
    }

    public List<Badanie> findByTyp(String typ) {
        List<Badanie> rs = badanieRepository.findByTyp(typ);
        return rs;
    }

}
