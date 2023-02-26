package tn.esprit.project.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.project.esprit.entity.Cours;
import tn.esprit.project.esprit.entity.Inscription;
import tn.esprit.project.esprit.entity.Skieur;
import tn.esprit.project.esprit.repository.SkieurRepository;

import java.util.List;

@Service
public class ISkieurImpl implements ISkieurService{


    @Autowired
    SkieurRepository skieurRepository;
    @Override
    public void addSkieur(Skieur s) {
        skieurRepository.save(s);

    }

    @Override
    public void updateSkieur(Skieur s, Long id) {
        Skieur SkieurFromDb = skieurRepository.findById(id).orElse(null);
        SkieurFromDb.setNumSkieur(SkieurFromDb.getNumSkieur());
        SkieurFromDb.setInscriptions(SkieurFromDb.getInscriptions());
        SkieurFromDb.setAbonnement(SkieurFromDb.getAbonnement());
        //SkieurFromDb.setPistes(SkieurFromDb.getPistes());
        SkieurFromDb.setDateNaissance(SkieurFromDb.getDateNaissance());
        SkieurFromDb.setNomS(SkieurFromDb.getNomS());
        SkieurFromDb.setPrenomS(SkieurFromDb.getPrenomS());
        SkieurFromDb.setVille(SkieurFromDb.getVille());
    }

    @Override
    public List<Skieur> getAll() {
     return (List<Skieur>) skieurRepository.findAll();

    }

    @Override
    public Skieur getById(Long id) {
        return  skieurRepository.findById(id).orElse(null);
    }

    @Override
    public void removeSkieur(Long id) {
        skieurRepository.deleteById(id);
    }
}
