package pl.wsiz.iid6.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.patient.dto.Recepta;
import pl.wsiz.iid6.patient.dto.Skierowanie;
import pl.wsiz.iid6.patient.jpa.ReceptaRepository;
import pl.wsiz.iid6.patient.jpa.SkierowanieRepository;

import java.util.List;

@Service
public class SkierowanieService {
    @Autowired
    private SkierowanieRepository skierowanieRepository;

    public List<Skierowanie> findByName(String name){
        List<Skierowanie> rs = skierowanieRepository.findByLekarz(name);
        return rs;
    }

    public List<Skierowanie> findAll() {
        List<Skierowanie> rs = skierowanieRepository.findAll();
        return rs;
    }
}
