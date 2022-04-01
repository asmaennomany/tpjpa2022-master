package business;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("B")
public class FichesBugs extends Fiche {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String client;

	public String getClient() {
		return client;
	}

	public void setClient(String client) {
		this.client = client;
	}

	
	

}
