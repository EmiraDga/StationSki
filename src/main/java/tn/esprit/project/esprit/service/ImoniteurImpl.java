package tn.esprit.project.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.project.esprit.entity.Moniteur;
import tn.esprit.project.esprit.entity.Skieur;
import tn.esprit.project.esprit.repository.MoniteurRepository;

import java.util.List;

@Service
public class ImoniteurImpl implements IMoniteurService{

    @Autowired
    MoniteurRepository moniteurRepository;

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
}
