package pl.wsiz.iid6.patient.jpa;

import org.springframework.data.repository.CrudRepository;
import pl.wsiz.iid6.patient.entity.LekEntity;

import java.util.List;

public interface LekRepository extends CrudRepository<LekEntity, Long> {
    List<LekEntity> findByNazwa(String nazwa);
    List<LekEntity> findByProducent(String producent);
    List<LekEntity> findAll();
}
