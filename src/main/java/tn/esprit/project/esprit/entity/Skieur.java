package tn.esprit.project.esprit.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;

@Table(name="Skieur")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Skieur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long numSkieur;

    private  String nomS;

    private String prenomS;

    private LocalDate dateNaissance;

    private String ville;

    @OneToMany(mappedBy = "skieur") //mappe par skieeur eli mawjoud f table inscription
    private Set<Inscription> inscriptions;


    @ManyToMany(mappedBy="skieurs" ,cascade = CascadeType.ALL)
   private List<Piste> pistes;


    @OneToOne
    private Abonnement abonnement;

}
