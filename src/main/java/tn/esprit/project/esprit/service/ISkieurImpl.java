package tn.esprit.project.esprit.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.project.esprit.entity.Cours;
import tn.esprit.project.esprit.entity.Inscription;
import tn.esprit.project.esprit.entity.Piste;
import tn.esprit.project.esprit.entity.Skieur;
import tn.esprit.project.esprit.repository.PisteRepository;
import tn.esprit.project.esprit.repository.SkieurRepository;

import java.util.List;
import java.util.Optional;
//@AllArgsConstructor tnjm thot hedhi wala @autowited
@Service
public class ISkieurImpl implements ISkieurService{


    @Autowired
    SkieurRepository skieurRepository;

    @Autowired
    PisteRepository pisteRepo;

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

    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste)
    {
        //recupration des objets
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Assert.notNull(skieur,"skieur not found");
        Piste piste = pisteRepo.findById(numPiste).orElse(null);
        Assert.notNull(piste,"piste not found");


         List<Piste> pistes = skieur.getPistes(); //1ere methode
           pistes.add(piste);
           skieur.setPistes(pistes);
           skieur.getPistes().add(piste);

        //skieur.getPistes().add(piste);       //2eme methode
         return skieurRepository.save(skieur);

}

    }



