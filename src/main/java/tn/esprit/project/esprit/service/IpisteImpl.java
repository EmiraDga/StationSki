package tn.esprit.project.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import tn.esprit.project.esprit.entity.Inscription;
import tn.esprit.project.esprit.entity.Piste;
import tn.esprit.project.esprit.entity.Skieur;
import tn.esprit.project.esprit.repository.PisteRepository;
import tn.esprit.project.esprit.repository.SkieurRepository;

import java.util.List;

@Service
public class IpisteImpl implements  IpisteService{

    @Autowired // pour injecter les dependances
    PisteRepository pisteRepository;

    @Autowired
    SkieurRepository skieurRepository;

    @Override
    public void addPiste(Piste piste) {
        pisteRepository.save(piste);
    }

    @Override
    public void updatePiste(Piste p, Long id) {
        Piste PisteFromDb = pisteRepository.findById(id).orElse(null);
        PisteFromDb.setNomPiste(PisteFromDb.getNomPiste());
        PisteFromDb.setNumPiste(PisteFromDb.getNumPiste());
        PisteFromDb.setPente(PisteFromDb.getPente());
        PisteFromDb.setCouleur(PisteFromDb.getCouleur());
        PisteFromDb.setPente(PisteFromDb.getPente());
      //  PisteFromDb.setSkieurs(PisteFromDb.getSkieurs());
        PisteFromDb.setLongeur(PisteFromDb.getLongeur());

    }

    @Override
    public List<Piste> getAll() {
        return  (List<Piste>) pisteRepository.findAll();
    }

    @Override
    public Piste getById(Long id) {
        return pisteRepository.findById(id).orElse(null);
    }

    @Override
    public void removePiste(Long id) {
 pisteRepository.deleteById(id);
    }

    public Piste assignPisteToskieur(Long numSkieur, Long numPiste)
    {
        //recupration des objets
        Skieur skieur = skieurRepository.findById(numSkieur).orElse(null);
        Assert.notNull(skieur,"skieur not found");
        Piste piste = pisteRepository.findById(numPiste).orElse(null);
        Assert.notNull(piste,"piste not found");


        List<Skieur> skieurs = piste.getSkieurs(); //1ere methode
        skieurs.add(skieur);
        piste.setSkieurs(skieurs);
        piste.getSkieurs().add(skieur);

        //skieur.getPistes().add(piste);       //2eme methode
        return pisteRepository.save(piste);

    }


}




