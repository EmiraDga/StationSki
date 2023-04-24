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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getNumPiste() {
		return numPiste;
	}

	public void setNumPiste(Long numPiste) {
		this.numPiste = numPiste;
	}

	public String getNomPiste() {
		return nomPiste;
	}

	public void setNomPiste(String nomPiste) {
		this.nomPiste = nomPiste;
	}

	public int getLongeur() {
		return longeur;
	}

	public void setLongeur(int longeur) {
		this.longeur = longeur;
	}

	public int getPente() {
		return pente;
	}

	public void setPente(int pente) {
		this.pente = pente;
	}

	public Couleur getCouleur() {
		return couleur;
	}

	public void setCouleur(Couleur couleur) {
		this.couleur = couleur;
	}

	public List<Skieur> getSkieurs() {
		return skieurs;
	}

	public void setSkieurs(List<Skieur> skieurs) {
		this.skieurs = skieurs;
	}

	public static long getSerilversionuid() {
		return seriLVersionUID;
	}

	public Piste(Long id, Long numPiste, String nomPiste, int longeur, int pente, Couleur couleur,
			List<Skieur> skieurs) {
		super();
		this.id = id;
		this.numPiste = numPiste;
		this.nomPiste = nomPiste;
		this.longeur = longeur;
		this.pente = pente;
		this.couleur = couleur;
		this.skieurs = skieurs;
	}

	public Piste() {
		super();
	}



}
