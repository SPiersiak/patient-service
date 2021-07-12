package pl.wsiz.iid6.patient.jpa;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.patient.dto.Skierowanie;
import pl.wsiz.iid6.patient.entity.PatientEntity;

import java.util.List;

public interface SkierowanieRepository extends CrudRepository<Skierowanie, Long> {
    Skierowanie findByLekarz(String lekarz);
    List<Skierowanie> findAll();
}
