package tn.esprit.project.esprit.service;

import tn.esprit.project.esprit.entity.Skieur;
import tn.esprit.project.esprit.entity.TypeAbonnement;

import java.util.List;

public interface ISkieurService {

    void addSkieur(Skieur s);

    void updateSkieur(Skieur s , Long id);
    List<Skieur> getAll();

    Skieur getById(Long id);
    void removeSkieur(Long id);

    Skieur assignSkieurToPiste(Long numSkieur, Long numPiste);
    public List<Skieur> retrieveSkieurBySubscriptionType(TypeAbonnement typeAbonnement);


}
