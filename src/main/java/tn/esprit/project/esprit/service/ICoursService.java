package tn.esprit.project.esprit.service;

import tn.esprit.project.esprit.entity.Cours;
import tn.esprit.project.esprit.entity.Skieur;

import java.util.List;

interface ICoursService {

    Cours add(Cours c);

   // Cours update(Cours c , Long id);

     Cours update(Cours newCourse) ;

        List<Cours> getAll();

    Cours getById(Long id);
    void remove(Long id);




}
