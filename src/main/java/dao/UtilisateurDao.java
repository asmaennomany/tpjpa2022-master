package dao;

import business.Utilisateur;

public class UtilisateurDao  extends AbstractJpaDao<String, Utilisateur>{

	public UtilisateurDao() {
		super(Utilisateur.class);
		
	}

}
