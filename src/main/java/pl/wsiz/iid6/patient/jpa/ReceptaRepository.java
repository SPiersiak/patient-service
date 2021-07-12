package pl.wsiz.iid6.patient.jpa;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.patient.dto.Recepta;
import pl.wsiz.iid6.patient.dto.Skierowanie;

import java.util.List;

public interface ReceptaRepository extends CrudRepository<Recepta, Long> {
    List<Recepta> findByPesel(String pesel);
    List<Recepta> findAll();
}