package business;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class KanbanBoard  implements Serializable{
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private long id;
	
	private String libelle;
	
	private List<Fiche> fiches;
	
	Utilisateur proprietair;

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
   
	@OneToMany
	@JoinColumn(name="kanbanId")
	public List<Fiche> getFiches() {
		return fiches;
	}

	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}
 
	@ManyToOne
	public Utilisateur getProprietair() {
		return proprietair;
	}

	public void setProprietair(Utilisateur proprietair) {
		this.proprietair = proprietair;
	}
	
	
	
	

}
