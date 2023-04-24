package tn.esprit.project.esprit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.project.esprit.entity.Abonnement;
import tn.esprit.project.esprit.entity.Cours;
import tn.esprit.project.esprit.repository.AbonnementRepository;

import java.time.LocalDate;
import java.util.List;

@Service
public class IAbonnementImpl implements  IAbonnementService
{

    @Autowired
    private  AbonnementRepository abonRepo;
    @Override
    public Abonnement addAbonnement(Abonnement a) {
        return abonRepo.save(a);
    }

    @Override
    public Abonnement UpdateAbonnement(Abonnement abonnement, Long id) {
        Abonnement abonnement1 = abonRepo.findById(id).orElse(null);
        abonnement1.setDateDebut(abonnement1.getDateDebut());
        abonnement1.setDateFin(abonnement1.getDateFin());
        abonnement1.setNumAbon(abonnement1.getNumAbon());
        abonnement1.setPrixAbon(abonnement1.getPrixAbon());
return  abonnement1;
    }

    @Override
    public List<Abonnement> getAll() {
        return ( List<Abonnement>) abonRepo.findAll();
    }

    @Override
    public void deleteAbonnement(Long id) {
        abonRepo.deleteById(id);

    }

    @Override
    public Abonnement getById(Long id) {
        return abonRepo.findById(id).orElse(null);
    }
    
    
  //On souhaite afficher les abonnements qui ont été créés entre deux dates données.
    List<Abonnement> retrieveSubscriptionsByDates(LocalDate startDate,LocalDate endDate);
    {



    }
    
}
