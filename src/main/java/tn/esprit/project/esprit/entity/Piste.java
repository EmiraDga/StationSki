package tn.esprit.project.esprit.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Set;

@Entity
@Table(name="Piste")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Piste  implements Serializable {
 private  static final long seriLVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Long numPiste;

    private  String nomPiste;

    private  int longeur;

    private  int pente;



    @Enumerated(EnumType.STRING)
    private Couleur couleur;

    @JsonIgnore //biderctionel manytomany onetoone waketha nsakr l bouucle mtei b jsonignore f jiha menhom
    @ManyToMany
    private List<Skieur> skieurs;
}
