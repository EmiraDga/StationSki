package tn.esprit.project.esprit.service;

import tn.esprit.project.esprit.entity.Cours;
import tn.esprit.project.esprit.entity.Skieur;

import java.util.List;

interface ICoursService {

    Cours add(Cours c);

    void update(Cours c , Long id);
    List<Cours> getAll();

    Cours getById(Long id);
    void remove(Long id);




}
