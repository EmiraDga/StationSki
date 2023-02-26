package tn.esprit.project.esprit.repository;
import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.project.esprit.entity.Abonnement;


public interface AbonnementRepository extends CrudRepository<Abonnement,Long> {
}
