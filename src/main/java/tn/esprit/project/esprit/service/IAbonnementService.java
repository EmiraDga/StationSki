package tn.esprit.project.esprit.service;

import tn.esprit.project.esprit.entity.Abonnement;

import java.util.List;

public interface IAbonnementService {

     Abonnement addAbonnement(Abonnement a);

    Abonnement UpdateAbonnement(Abonnement abonnement , Long id);

    List<Abonnement> getAll();

    void deleteAbonnement (Long id) ;

    Abonnement getById(Long id);
}
