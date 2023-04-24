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




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public Long getNumSkieur() {
		return numSkieur;
	}




	public void setNumSkieur(Long numSkieur) {
		this.numSkieur = numSkieur;
	}




	public String getNomS() {
		return nomS;
	}




	public void setNomS(String nomS) {
		this.nomS = nomS;
	}




	public String getPrenomS() {
		return prenomS;
	}




	public void setPrenomS(String prenomS) {
		this.prenomS = prenomS;
	}




	public LocalDate getDateNaissance() {
		return dateNaissance;
	}




	public void setDateNaissance(LocalDate dateNaissance) {
		this.dateNaissance = dateNaissance;
	}




	public String getVille() {
		return ville;
	}




	public void setVille(String ville) {
		this.ville = ville;
	}




	public Set<Inscription> getInscriptions() {
		return inscriptions;
	}




	public void setInscriptions(Set<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}




	public List<Piste> getPistes() {
		return pistes;
	}




	public void setPistes(List<Piste> pistes) {
		this.pistes = pistes;
	}




	public Abonnement getAbonnement() {
		return abonnement;
	}




	public void setAbonnement(Abonnement abonnement) {
		this.abonnement = abonnement;
	}




	public Skieur(Long id, Long numSkieur, String nomS, String prenomS, LocalDate dateNaissance, String ville,
			Set<Inscription> inscriptions, List<Piste> pistes, Abonnement abonnement) {
		super();
		this.id = id;
		this.numSkieur = numSkieur;
		this.nomS = nomS;
		this.prenomS = prenomS;
		this.dateNaissance = dateNaissance;
		this.ville = ville;
		this.inscriptions = inscriptions;
		this.pistes = pistes;
		this.abonnement = abonnement;
	}




	public Skieur() {
		super();
	}
    
    
    
    

}
