package tn.esprit.project.esprit.service;

import tn.esprit.project.esprit.entity.Skieur;

import java.util.List;

public interface ISkieurService {

    void addSkieur(Skieur s);

    void updateSkieur(Skieur s , Long id);
    List<Skieur> getAll();

    Skieur getById(Long id);
    void removeSkieur(Long id);

}
