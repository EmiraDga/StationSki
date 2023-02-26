package tn.esprit.project.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.project.esprit.entity.Abonnement;
import tn.esprit.project.esprit.entity.Cours;
import tn.esprit.project.esprit.service.IAbonnementService;
import tn.esprit.project.esprit.service.ICoursServiceImpl;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class AbonnementController {


    @Autowired
    private IAbonnementService iAbonnementService;

    @RequestMapping(value = "/abonnement" , method = RequestMethod.GET)
    public List<Abonnement> getAll() {

        return iAbonnementService.getAll();

    }

    @GetMapping ("/abonnement/{id}")
    public Abonnement getById(@PathVariable Long id) {
        return iAbonnementService.getById(id);
    }

    @PostMapping("/abonnement/add")
    public Abonnement add(@org.springframework.web.bind.annotation.RequestBody Abonnement abonnement) throws Exception {
         return  iAbonnementService.addAbonnement(abonnement);
    }


    @PutMapping("/abonnement/update/{id}")
    Abonnement Update(@org.springframework.web.bind.annotation.RequestBody Abonnement abonnement ,@PathVariable Long id)
    {

        return iAbonnementService.UpdateAbonnement(abonnement , id);
    }


    @RequestMapping(value = "/abonnement/delete/{id}", method = RequestMethod.DELETE)
    void deleteAbonnement (@PathVariable Long id)
    { iAbonnementService.deleteAbonnement(id);}



}
