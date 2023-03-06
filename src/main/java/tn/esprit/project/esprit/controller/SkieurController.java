package tn.esprit.project.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.project.esprit.entity.Piste;
import tn.esprit.project.esprit.entity.Skieur;
import tn.esprit.project.esprit.entity.TypeAbonnement;
import tn.esprit.project.esprit.service.ISkieurService;
import tn.esprit.project.esprit.service.IpisteService;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class SkieurController {

    @Autowired
    private ISkieurService iSkieurService;

    private  IpisteService ipisteService;

    @RequestMapping(value = "/skieur" , method = RequestMethod.GET)
    public List<Skieur> GetAll() {return iSkieurService.getAll();}

    @GetMapping("/skieur/{id}")
    public Skieur findByID(@PathVariable  Long id) {
        return iSkieurService.getById(id);
    }

    @PostMapping("/skieur/add")
    public void saveSkieur(@org.springframework.web.bind.annotation.RequestBody Skieur skieur) throws Exception {
        iSkieurService.addSkieur(skieur);
    }

    @RequestMapping(value = "/skieur/delete/{id}", method = RequestMethod.DELETE)
    public void deleteSkieur(@PathVariable Long id) {
        iSkieurService.removeSkieur(id);
    }
    @PutMapping("/skieur/update/{id}")
    public void updateSkieur(@org.springframework.web.bind.annotation.RequestBody Skieur skieur , @PathVariable Long id) {
        iSkieurService.updateSkieur(skieur , id);
    }



    @GetMapping("/skieur/getSkieurSubs/typeAbonnement")
    public List<Skieur> retrieveSkieurBySubscriptionType(TypeAbonnement typeAbonnement)
    {
        return  iSkieurService.retrieveSkieurBySubscriptionType(typeAbonnement);

    }

}
