package pl.wsiz.iid6.patientservice.jpa;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.patientservice.entity.PatientEntity;

public interface PatientRepository extends CrudRepository<PatientEntity, Long> {
}
