package tn.esprit.project.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.project.esprit.entity.Cours;
import tn.esprit.project.esprit.entity.Inscription;
import tn.esprit.project.esprit.service.ICoursServiceImpl;
import tn.esprit.project.esprit.service.IinscriptionService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class InscriptionController {
    @Autowired
    private IinscriptionService inscriService;


    @RequestMapping(value = "/inscription" , method = RequestMethod.GET)
    public List<Inscription> GetAll() {

        return inscriService.getAll();

    }


    @PostMapping("/inscription/add")
    public void saveInscription(@org.springframework.web.bind.annotation.RequestBody Inscription inscription) throws Exception {
         inscriService.addInscription(inscription);
    }


    @RequestMapping(value = "/inscription/delete/{id}", method = RequestMethod.DELETE)
    public void deleteInscription(@PathVariable Long id) {
        inscriService.removeInscription(id);
    }


    @PutMapping("/inscription/update/{id}")
    public void updateInscription(@PathVariable Long id, @org.springframework.web.bind.annotation.RequestBody Inscription inscription) {
        inscriService.updateInscription(inscription , id);
    }


}
