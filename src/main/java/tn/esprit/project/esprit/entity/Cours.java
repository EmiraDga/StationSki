package tn.esprit.project.esprit.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Cours")
public class Cours {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long numCours;

    private  int niveau;

    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;

    private  Support support;

    private Float prix;

    private  int creneau;


    @OneToMany(mappedBy = "cours")
    private List<Inscription> inscriptions;

}
