package tn.esprit.project.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.project.esprit.entity.Inscription;
import tn.esprit.project.esprit.entity.Piste;
import tn.esprit.project.esprit.repository.PisteRepository;

import java.util.List;

@Service
public class IpisteImpl implements  IpisteService{

    @Autowired // pour injecter les dependances
    PisteRepository pisteRepository;

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
}
