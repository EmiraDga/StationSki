package tn.esprit.project.esprit.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import net.bytebuddy.asm.Advice;

import javax.persistence.*;
import java.time.LocalDate;

@Table(name="Abonnement")
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Abonnement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long numAbon;

    private LocalDate dateDebut;

    private LocalDate dateFin;

    private  Float prixAbon;

    @Enumerated(EnumType.STRING)
    private TypeAbonnement typeAbon;
}
