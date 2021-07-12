package pl.wsiz.iid6.patient.jpa;
import java.util.Date;
import java.util.List;
import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.patient.dto.Pacjent;
import pl.wsiz.iid6.patient.entity.PatientEntity;

public interface PatientRepository extends CrudRepository<PatientEntity, Long>
{
    List<PatientEntity> findAllByLastName(String lastName);
    List<PatientEntity> findAllByFirstName(String firstName);
    List<PatientEntity> findByPesel(String pesel);
    List<PatientEntity> findAll();



}
