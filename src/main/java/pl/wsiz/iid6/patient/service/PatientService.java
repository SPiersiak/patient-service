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

    public Pacjent findbyID(Long id) {
        Optional<PatientEntity> res = patientRepository.findById(id);
        if (res.isPresent()) {
            PatientEntity pat = res.get();
            return new Pacjent(pat.getImie(), pat.getNazwisko(), pat.getMiejscowosc(), pat.getKod(), pat.getUlica(), pat.getPesel(), pat.getDataUrodzenia(), pat.getMail(), pat.getNrTelefonu(), pat.getPlec());
        }
        Date date = new Date();
        return new Pacjent("None", "None", "None", "None", "None", "None", "None", "None", "None", "None");

    }

    public List<PatientEntity> findAllByImie(String imie)
    {
        return patientRepository.findAllByImie(imie);
    }

    public List<PatientEntity> findAll()
    {
        return patientRepository.findAll();

    }

    public List<PatientEntity> findAllByNazwisko(String nazwisko)
    {
        return patientRepository.findAllByNazwisko(nazwisko);
    }

    public void saveNewPacjent(Pacjent pat){
        PatientEntity patientEntity = new PatientEntity(pat.getImie(), pat.getNazwisko(), pat.getMiejscowosc(), pat.getKod(), pat.getUlica(), pat.getPesel(), pat.getDataUrodzenia(), pat.getMail(), pat.getNrTelefonu(), pat.getPlec());
        patientRepository.save(patientEntity);
    }

}
