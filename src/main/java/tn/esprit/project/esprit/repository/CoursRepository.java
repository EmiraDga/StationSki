package tn.esprit.project.esprit.repository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.project.esprit.entity.Cours;

@Repository
public interface CoursRepository extends CrudRepository<Cours,Long> {




}
