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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumAbon() {
		return numAbon;
	}

	public void setNumAbon(Long numAbon) {
		this.numAbon = numAbon;
	}

	public LocalDate getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(LocalDate dateDebut) {
		this.dateDebut = dateDebut;
	}

	public LocalDate getDateFin() {
		return dateFin;
	}

	public void setDateFin(LocalDate dateFin) {
		this.dateFin = dateFin;
	}

	public Float getPrixAbon() {
		return prixAbon;
	}

	public void setPrixAbon(Float prixAbon) {
		this.prixAbon = prixAbon;
	}

	public TypeAbonnement getTypeAbon() {
		return typeAbon;
	}

	public void setTypeAbon(TypeAbonnement typeAbon) {
		this.typeAbon = typeAbon;
	}

	public Abonnement(Long id, Long numAbon, LocalDate dateDebut, LocalDate dateFin, Float prixAbon,
			TypeAbonnement typeAbon) {
		super();
		this.id = id;
		this.numAbon = numAbon;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.prixAbon = prixAbon;
		this.typeAbon = typeAbon;
	}

	public Abonnement() {
		super();
	}

    
    

}
