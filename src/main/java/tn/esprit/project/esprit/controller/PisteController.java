package tn.esprit.project.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.project.esprit.entity.Cours;
import tn.esprit.project.esprit.entity.Inscription;
import tn.esprit.project.esprit.entity.Piste;
import tn.esprit.project.esprit.service.IinscriptionService;
import tn.esprit.project.esprit.service.IpisteService;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class PisteController {

    @Autowired
    private IpisteService ipisteService;

    @RequestMapping(value = "/piste" , method = RequestMethod.GET)
    public List<Piste> GetAll() {return ipisteService.getAll();}

    @GetMapping("/piste/{id}")
    public Piste findByID(Long id) {
        return ipisteService.getById(id);
    }

    @PostMapping("/piste/add")
    public void savePiste(@org.springframework.web.bind.annotation.RequestBody Piste piste) throws Exception {
         ipisteService.addPiste(piste);
    }

    @RequestMapping(value = "/piste/delete/{id}", method = RequestMethod.DELETE)
    public void deletePiste(@PathVariable Long id) {
        ipisteService.removePiste(id);
    }


    @PutMapping("/piste/update/{id}")
    public void updatePiste(@org.springframework.web.bind.annotation.RequestBody Piste piste , @PathVariable Long id) {
        ipisteService.updatePiste(piste , id);
    }




}
