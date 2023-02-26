package tn.esprit.project.esprit.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.project.esprit.entity.Inscription;

@Repository
public interface InscriptionRpository extends CrudRepository<Inscription, Long> {
}
