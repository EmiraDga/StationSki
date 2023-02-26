package tn.esprit.project.esprit.service;

import tn.esprit.project.esprit.entity.Moniteur;
import tn.esprit.project.esprit.entity.Piste;

import java.util.List;

public interface IMoniteurService {

    void addMoniteur(Moniteur piste);

    void updatMoniteur(Moniteur p , Long id);
    List<Moniteur> getAll();

    Moniteur getById(Long id);
    void removeMoniteur(Long id);
}
