package pl.wsiz.iid6.patientservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.wsiz.iid6.patientservice.dto.Pacjent;
import pl.wsiz.iid6.patientservice.entity.PatientEntity;
import pl.wsiz.iid6.patientservice.jpa.PatientRepository;

import java.util.Optional;

@Service
public class PatientService {
    @Autowired
    private PatientRepository patientRepository;
    public Pacjent findbyId(Long id){
        Optional<PatientEntity> res = patientRepository.findById(id);
        if (res.isPresent()) {
            PatientEntity pat = res.get();
            return new Pacjent(pat.getFirstName(),pat.getLastName(), pat.getPesel() );
        }
        return new Pacjent("None", "None", "None");
    }
}
