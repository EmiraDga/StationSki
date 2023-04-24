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


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public Long getNumCours() {
		return numCours;
	}


	public void setNumCours(Long numCours) {
		this.numCours = numCours;
	}


	public int getNiveau() {
		return niveau;
	}


	public void setNiveau(int niveau) {
		this.niveau = niveau;
	}


	public TypeCours getTypeCours() {
		return typeCours;
	}


	public void setTypeCours(TypeCours typeCours) {
		this.typeCours = typeCours;
	}


	public Support getSupport() {
		return support;
	}


	public void setSupport(Support support) {
		this.support = support;
	}


	public Float getPrix() {
		return prix;
	}


	public void setPrix(Float prix) {
		this.prix = prix;
	}


	public int getCreneau() {
		return creneau;
	}


	public void setCreneau(int creneau) {
		this.creneau = creneau;
	}


	public List<Inscription> getInscriptions() {
		return inscriptions;
	}


	public void setInscriptions(List<Inscription> inscriptions) {
		this.inscriptions = inscriptions;
	}


	public Cours(Long id, Long numCours, int niveau, TypeCours typeCours, Support support, Float prix, int creneau,
			List<Inscription> inscriptions) {
		super();
		this.id = id;
		this.numCours = numCours;
		this.niveau = niveau;
		this.typeCours = typeCours;
		this.support = support;
		this.prix = prix;
		this.creneau = creneau;
		this.inscriptions = inscriptions;
	}


	public Cours() {
		super();
	}

    
    
    
}
