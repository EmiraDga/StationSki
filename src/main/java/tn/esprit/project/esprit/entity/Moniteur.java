package tn.esprit.project.esprit.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="Moniteur")
public class Moniteur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;



    private  Long numMoniteur;

    private  String nomM;

    private  String prenomM;

    private LocalDate dateRecru ;

    @OneToMany
    private List<Cours> cours;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumMoniteur() {
		return numMoniteur;
	}

	public void setNumMoniteur(Long numMoniteur) {
		this.numMoniteur = numMoniteur;
	}

	public String getNomM() {
		return nomM;
	}

	public void setNomM(String nomM) {
		this.nomM = nomM;
	}

	public String getPrenomM() {
		return prenomM;
	}

	public void setPrenomM(String prenomM) {
		this.prenomM = prenomM;
	}

	public LocalDate getDateRecru() {
		return dateRecru;
	}

	public void setDateRecru(LocalDate dateRecru) {
		this.dateRecru = dateRecru;
	}

	public List<Cours> getCours() {
		return cours;
	}

	public void setCours(List<Cours> cours) {
		this.cours = cours;
	}

	public Moniteur(Long id, Long numMoniteur, String nomM, String prenomM, LocalDate dateRecru, List<Cours> cours) {
		super();
		this.id = id;
		this.numMoniteur = numMoniteur;
		this.nomM = nomM;
		this.prenomM = prenomM;
		this.dateRecru = dateRecru;
		this.cours = cours;
	}

	public Moniteur() {
		super();
	}
    
    
}
