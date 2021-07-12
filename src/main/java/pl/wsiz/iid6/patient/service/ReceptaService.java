package pl.wsiz.iid6.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.patient.dto.Recepta;
import pl.wsiz.iid6.patient.entity.PatientEntity;
import pl.wsiz.iid6.patient.jpa.PatientRepository;
import pl.wsiz.iid6.patient.jpa.ReceptaRepository;

import java.util.List;

@Service
public class ReceptaService {
    @Autowired
    private ReceptaRepository receptaRepository;

    public List<Recepta> findByPesel(String pesel){
        List<Recepta> rs = receptaRepository.findByPesel(pesel);
        return rs;
    }

    public List<Recepta> findAll() {
        List<Recepta> rs = receptaRepository.findAll();
        return rs;
    }
}

