package pl.wsiz.iid6.patient.jpa;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.patient.dto.Badanie;
import pl.wsiz.iid6.patient.entity.LekEntity;

import java.util.List;

public interface BadanieRepository extends CrudRepository<Badanie, Long> {
    List<Badanie> findByTyp(String typ);
    List<Badanie> findByPesel(String pesel);
    List<Badanie> findAll();
}

