package tn.esprit.project.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.theme.CookieThemeResolver;
import tn.esprit.project.esprit.entity.Cours;
import tn.esprit.project.esprit.repository.CoursRepository;

import javax.print.attribute.standard.MediaSize;
import java.util.List;

@Service
public class ICoursServiceImpl implements  ICoursService{


@Autowired    //
private CoursRepository courRepo ;
    @Override
    public Cours add(Cours c) {
         return courRepo.save(c);
    }

    //@Override
  //  public void update(Cours c) {
//courRepo.save(c);
//    }


    //..???????MCH SUR VOID!!????
    @Override
     public void update(Cours c, Long id) {
        Cours coursFromDb = courRepo.findById(id).orElse(null);
        coursFromDb.setPrix(coursFromDb.getPrix());
        coursFromDb.setNumCours(coursFromDb.getNumCours());
        coursFromDb.setNiveau(coursFromDb.getNiveau());
        coursFromDb.setCreneau(coursFromDb.getCreneau());
        coursFromDb.setInscriptions(coursFromDb.getInscriptions());
        coursFromDb.setSupport(coursFromDb.getSupport());
        coursFromDb.setId(coursFromDb.getId());

    }

    @Override
    public List<Cours> getAll() {
        return (List<Cours>) courRepo.findAll();
    }

    @Override
    public Cours getById(Long id) {
        return courRepo.findById(id).orElse(null);

    }

    @Override
    public void remove(Long id) {
        courRepo.deleteById(id);

    }
}
