package tn.esprit.project.esprit.service;

import tn.esprit.project.esprit.entity.Inscription;

import java.util.List;

public interface IinscriptionService {

    void addInscription(Inscription inscription);

    void updateInscription(Inscription inscription , Long id);
    List<Inscription> getAll();

    Inscription getById(Long id);
    void removeInscription(Long id);


    
    
    
}
