package business;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("R")
public class FicheRequest extends Fiche {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String Request;

	public String getRequest() {
		return Request;
	}

	public void setRequest(String request) {
		Request = request;
	}
	
	

}
