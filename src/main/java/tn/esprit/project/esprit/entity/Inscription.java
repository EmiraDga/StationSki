package tn.esprit.project.esprit.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="Inscription")
public class Inscription {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private Long numInscription;

    private  int numSemaine;

    @ManyToOne
    private  Skieur skieur;
    @ManyToOne
    private Cours cours;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getNumInscription() {
		return numInscription;
	}
	public void setNumInscription(Long numInscription) {
		this.numInscription = numInscription;
	}
	public int getNumSemaine() {
		return numSemaine;
	}
	public void setNumSemaine(int numSemaine) {
		this.numSemaine = numSemaine;
	}
	public Skieur getSkieur() {
		return skieur;
	}
	public void setSkieur(Skieur skieur) {
		this.skieur = skieur;
	}
	public Cours getCours() {
		return cours;
	}
	public void setCours(Cours cours) {
		this.cours = cours;
	}
	public Inscription(Long id, Long numInscription, int numSemaine, Skieur skieur, Cours cours) {
		super();
		this.id = id;
		this.numInscription = numInscription;
		this.numSemaine = numSemaine;
		this.skieur = skieur;
		this.cours = cours;
	}
	public Inscription() {
		super();
	}




}
