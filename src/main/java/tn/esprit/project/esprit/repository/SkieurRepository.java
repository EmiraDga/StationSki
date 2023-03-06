package tn.esprit.project.esprit.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.project.esprit.entity.Skieur;
import tn.esprit.project.esprit.entity.TypeAbonnement;
import tn.esprit.project.esprit.entity.TypeCours;

import java.util.List;
import java.util.concurrent.locks.LockSupport;

@Repository
public interface SkieurRepository extends CrudRepository<Skieur, Long> {

    List <Skieur>  findByAbonnementTypeAbon(TypeAbonnement typeAbonnement);
                 //Abonnement attribut mawjoud f classe skieur
    /// skieur fih typeAbon equal TypeAbonnement

    //select s from skieur s where s.abonnement.typeAbon = ?1)
   List<Skieur> findByInscriptionsCoursTypeCours(TypeCours typeCours);


}
