package business;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="fiche_type")
public abstract class  Fiche implements Serializable{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	
	private String libelle;
	
	private Date dateButoire;
	
	private String tempsEstime;
	
	private ArrayList<String> tags;
	
	private String lieu;
	
	private String url;
	
	private String noteExplivative;
	
	private Section etat;

	@Id
	@GeneratedValue
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Date getDateButoire() {
		return dateButoire;
	}

	public void setDateButoire(Date dateButoire) {
		this.dateButoire = dateButoire;
	}

	public String getTempsEstime() {
		return tempsEstime;
	}

	public void setTempsEstime(String tempsEstime) {
		this.tempsEstime = tempsEstime;
	}

	public ArrayList<String> getTags() {
		return tags;
	}

	public void setTags(ArrayList<String> tags) {
		this.tags = tags;
	}

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getNoteExplivative() {
		return noteExplivative;
	}

	public void setNoteExplivative(String noteExplivative) {
		this.noteExplivative = noteExplivative;
	}

	@ManyToOne
	public Section getEtat() {
		return etat;
	}

	public void setEtat(Section etat) {
		this.etat = etat;
	}
	
	
	
	
}
