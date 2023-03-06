package tn.esprit.project.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.project.esprit.entity.Moniteur;
import tn.esprit.project.esprit.entity.Piste;
import tn.esprit.project.esprit.service.IMoniteurService;
import tn.esprit.project.esprit.service.IpisteService;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class MoniteurController {

    @Autowired
    private IMoniteurService iMoniteurService;

    @RequestMapping(value = "/moniteur" , method = RequestMethod.GET)
    public List<Moniteur> GetAll() {return iMoniteurService.getAll();}

    @GetMapping("/moniteur/{id}")
    public Moniteur findByID(Long id) {
        return iMoniteurService.getById(id);
    }

    @PostMapping("/moniteur/add")
    public void saveMoniteur(@org.springframework.web.bind.annotation.RequestBody Moniteur moniteur) throws Exception {
        iMoniteurService.addMoniteur(moniteur);
    }
    @RequestMapping(value = "/moniteur/delete/{id}", method = RequestMethod.DELETE)
    public void deleteMoniteur(@PathVariable Long id) {
        iMoniteurService.removeMoniteur(id);
    }
    @PutMapping("/moniteur/update/{id}")
    public void updateMoniteur(@org.springframework.web.bind.annotation.RequestBody Moniteur moniteur , @PathVariable Long id) {
        iMoniteurService.updatMoniteur(moniteur , id);
    }

    @PutMapping("/moniteur/assign/{numCourse}")
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse)
    {
       return iMoniteurService.addInstructorAndAssignToCourse(moniteur,numCourse);

    }

}
