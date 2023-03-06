package tn.esprit.project.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.project.esprit.entity.Cours;
import tn.esprit.project.esprit.entity.Moniteur;
import tn.esprit.project.esprit.entity.Skieur;
import tn.esprit.project.esprit.repository.CoursRepository;
import tn.esprit.project.esprit.repository.MoniteurRepository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class ImoniteurImpl implements IMoniteurService{

    @Autowired
    MoniteurRepository moniteurRepository;

    @Autowired
    CoursRepository coursRepository;

    @Override
    public void addMoniteur(Moniteur moniteur) {
        moniteurRepository.save(moniteur);
    }

    @Override
    public void updatMoniteur(Moniteur m, Long id) {
        Moniteur MoniteurFromDb = moniteurRepository.findById(id).orElse(null);
        MoniteurFromDb.setCours(MoniteurFromDb.getCours());
        MoniteurFromDb.setNumMoniteur(MoniteurFromDb.getNumMoniteur());
        MoniteurFromDb.setNomM(MoniteurFromDb.getNomM());
        MoniteurFromDb.setPrenomM(MoniteurFromDb.getPrenomM());
        MoniteurFromDb.setDateRecru(MoniteurFromDb.getDateRecru());


    }

    @Override
    public List<Moniteur> getAll() {
        return  (List<Moniteur>) moniteurRepository.findAll();
    }

    @Override
    public Moniteur getById(Long id) {
        return  moniteurRepository.findById(id).orElse(null);
    }

    @Override
    public void removeMoniteur(Long id) {
        moniteurRepository.deleteById(id);
    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse) {
        List<Cours> courses = new ArrayList<>(); // create a new list of courses

        Moniteur moniteur1 = new Moniteur();
        moniteur1.setNomM("John");
        moniteur1.setPrenomM("Green");
        moniteur1.setDateRecru(LocalDate.parse("2023-03-02"));
        moniteur1.setNumMoniteur(254L);
        moniteur1.setCours(courses);
        addMoniteur(moniteur1);

        Cours cours = coursRepository.findById(numCourse).orElse(null);
        Assert.notNull(cours,"cours not found");

        List <Cours> cours1 = moniteur1.getCours();

        cours1.add(cours);
        moniteur1.setCours(cours1);
        moniteur1.getCours().add(cours);

        return moniteurRepository.save(moniteur);
    }
}
