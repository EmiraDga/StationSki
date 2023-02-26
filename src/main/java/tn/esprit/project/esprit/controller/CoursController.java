package tn.esprit.project.esprit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.project.esprit.entity.Cours;
import tn.esprit.project.esprit.service.ICoursServiceImpl;

import java.util.List;

//@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/v1/")
public class CoursController {

    @Autowired
    private ICoursServiceImpl iCoursService;

@RequestMapping(value = "/cours" , method = RequestMethod.GET)
    public List<Cours> GetAll() {

    return iCoursService.getAll();

}
    @GetMapping ("/cours/{id}")
    public Cours findByID(Long id) {
        return iCoursService.getById(id);
    }

    @PostMapping("/cours/add")
    public Cours saveCours(@org.springframework.web.bind.annotation.RequestBody Cours cours) throws Exception {
        return iCoursService.add(cours);
    }

    @RequestMapping(value = "/cours/delete/{id}", method = RequestMethod.DELETE)
    public void deleteCours(@PathVariable Long id) {
        iCoursService.remove(id);
    }

    @PutMapping("/cours/update/{id}")
    public void updateCours(@org.springframework.web.bind.annotation.RequestBody Cours cours) {
         iCoursService.update(cours);
    }


}
