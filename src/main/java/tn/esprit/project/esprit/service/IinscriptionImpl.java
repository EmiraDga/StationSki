package tn.esprit.project.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.project.esprit.entity.Cours;
import tn.esprit.project.esprit.entity.Inscription;
import tn.esprit.project.esprit.repository.InscriptionRpository;

import java.util.List;

@Service
public class IinscriptionImpl implements  IinscriptionService{

    @Autowired
    InscriptionRpository inscriptionRpository;

    @Override
    public void addInscription(Inscription inscription) {
        inscriptionRpository.save(inscription);
    }

    @Override
    public void updateInscription(Inscription inscription, Long id) {
        Inscription InscriFromDb = inscriptionRpository.findById(id).orElse(null);
        InscriFromDb.setNumInscription(InscriFromDb.getNumInscription());
        InscriFromDb.setNumSemaine(InscriFromDb.getNumSemaine());
        InscriFromDb.setSkieur(InscriFromDb.getSkieur());
        InscriFromDb.setCours(InscriFromDb.getCours());
    }

    @Override
    public List<Inscription> getAll() {
        return (List<Inscription>) inscriptionRpository.findAll();
    }

    @Override
    public Inscription getById(Long id) {
        return inscriptionRpository.findById(id).orElse(null);
    }

    @Override
    public void removeInscription(Long id) {
        inscriptionRpository.deleteById(id);
    }
}
