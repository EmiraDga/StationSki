package tn.esprit.project.esprit.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.project.esprit.entity.Piste;

@Repository
public interface PisteRepository extends CrudRepository<Piste, Long> {
}
