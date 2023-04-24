package tn.esprit.project.esprit.service;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.project.esprit.entity.*;
import tn.esprit.project.esprit.repository.PisteRepository;
import tn.esprit.project.esprit.repository.SkieurRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

//@AllArgsConstructor tnjm thot hedhi wala @autowited
@Service
public class ISkieurImpl implements ISkieurService {


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
        return skieurRepository.findById(id).orElse(null);
    }

    @Override
    public void removeSkieur(Long id) {
        skieurRepository.deleteById(id);
    }

    public Skieur assignSkieurToPiste(Long numSkieur, Long numPiste) {
        //recupration des objets
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Assert.notNull(skieur, "skieur not found");
        Piste piste = pisteRepo.findById(numPiste).orElse(null);
        Assert.notNull(piste, "piste not found");


        List<Piste> pistes = skieur.getPistes(); //1ere methode
        pistes.add(piste);
        skieur.setPistes(pistes);
        skieur.getPistes().add(piste);

        //skieur.getPistes().add(piste);       //2eme methode
        return skieurRepository.save(skieur);

    }

    public List<Skieur> retrieveSkieurBySubscriptionType(TypeAbonnement typeAbonnement) {

        return skieurRepository.findByAbonnementTypeAbon(typeAbonnement);

    }

    @Override
    public Skieur addSkeiurAndAssignToCourse(Skieur skieur) {
        return null;
    }

    /*public Skieur addSkeiurAndAssignToCourse(Skieur skieur)
    {
        Assert.notNull(skieur.getAbonnement(),"subscriptino not be null");
        Assert.notNull(skieur.getInscriptions(),"inscription not be null");
        Assert.notNull(skieur.getInscriptions().forEach(inscription -> Assert.notNull(inscription.getCours().getNumCours(),"no num cours found"),

        Cours cours  = coursRepo.findById(inscription.getCours().getNumCours()).orElse(null); //nthaabtou l cours hedheka rjaali mel base wala null
        Assert.notNull(cours);
        inscription.setCours(cours);
        });
        skieurRepository.saveAndFlush(skieur);
        skieur.getInscription.forEach(inscription -> inscriptionRepo.save(inscription));
        return skieur

    }
    */
    public Skieur addSkierAndAssignToCourse(Skieur skieur) {
        return null;

    }

//Nested Object
    /*    Abonnement a = skieur.getAbonnement();
        Assert.notNull(a, "Abonnement ne doit pas etre null");
        Set<Inscription> inscriptions = skieur.getInscriptions();
        inscriptions.forEach(inscription -> {
                    Assert.notNull(inscription.getCours(), "no Cours Found");
                    Assert.notNull(inscription.getCours().getNumCours(), "no numCours found");
                    Cours c = coursRepo.findById(inscription.getCours().getNumCours()).orElse(null);
                    Assert.notNull(c, "cours not in database");
                    inscription.setCours(c);


                }
        );
        skieurRepository.saveAndFlush(skieur);
        skieur.getInscriptions().forEach(inscription -> {
            inscription.setSkieur(skieur);
            inscriptionRepository.save(inscription);
        });
        return skieur;
    }



    }*/


}






