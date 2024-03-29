package pl.wsiz.iid6.patient.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import pl.wsiz.iid6.patient.dto.Pacjent;
import pl.wsiz.iid6.patient.dto.Pacjent;
import pl.wsiz.iid6.patient.entity.PatientEntity;
import pl.wsiz.iid6.patient.jpa.PatientRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;

    public Pacjent findbyId (Long id) {
        Optional<PatientEntity> res = patientRepository.findById(id);
        if (res.isPresent()) {
            PatientEntity pat = res.get();
            return new Pacjent(pat.getFirstName(), pat.getLastName(), pat.getPesel(), pat.getMiejscowosc());
        }
        return new Pacjent("None", "None");
    }

    public List<PatientEntity> findByLastName(String name){
        List<PatientEntity> rs = patientRepository.findAllByLastName(name);
        return rs;
    }

    public List<PatientEntity> findByFirstName(String name){
        List<PatientEntity> rs = patientRepository.findAllByFirstName(name);
        return rs;
    }

    public List<PatientEntity> findByPesel(String pesel){
        List<PatientEntity> rs = patientRepository.findByPesel(pesel);
        return rs;
    }

    public List<PatientEntity> findAll() {
        List<PatientEntity> rs = patientRepository.findAll();
        return rs;
    }
}
