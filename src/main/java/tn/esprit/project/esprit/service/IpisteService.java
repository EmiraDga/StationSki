package tn.esprit.project.esprit.service;

import tn.esprit.project.esprit.entity.Piste;
import tn.esprit.project.esprit.entity.Skieur;

import java.util.List;

public interface IpisteService {
    void addPiste(Piste piste);

    void updatePiste(Piste p , Long id);
    List<Piste> getAll();

    Piste getById(Long id);
    void removePiste(Long id);
     Piste assignPisteToskieur(Long numSkieur, Long numPiste);

}
