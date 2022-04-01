package jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import business.Fiche;
import business.FicheRequest;
import business.FichesBugs;
import business.KanbanBoard;
import business.Section;
import business.Utilisateur;
import dao.FicheDao;
import dao.KanbanBoardDao;
import dao.SectionDao;
import dao.UtilisateurDao;
// import javax.persistence.PersistenceContext;

public class JpaTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

//		EntityManager manager = EntityManagerHelper.getEntityManager();
//		
//		EntityTransaction tx = manager.getTransaction();
//		tx.begin();
//
//
//		try {
//			
//			
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//		tx.commit();
//
//
//		manager.close();
//		EntityManagerHelper.closeEntityManagerFactory();
//		//		factory.close();ù
		
		//dao
		UtilisateurDao udao =new UtilisateurDao();
		SectionDao sdao = new SectionDao();
		FicheDao fdao = new FicheDao();
		KanbanBoardDao kdao =new KanbanBoardDao();
		
////utilisateur
//		Utilisateur u1 = new Utilisateur();
//		u1.setEmail("asmaennom");
//		u1.setNom("ennomanny");
//		u1.setPrenom("asmae");
//		udao.save(u1);
//		
//		
////section
//		
//		Section att =new Section();
//		att.setCarte("en attente");
//		Section cou =new Section();
//		cou.setCarte("en cours");
//		Section rea =new Section();
//		rea.setCarte("realise");
//		
//		sdao.save(att);
//		sdao.save(cou);
//		sdao.save(rea);
//		
//// fichie
//		
//		Fiche f1 =new FicheRequest();
//		f1.setEtat(cou);
//		
//		Fiche f2 =new FichesBugs();
//		f2.setEtat(att);
//		
//		fdao.save(f1);
//		fdao.save(f2);
//		
//// board
//		KanbanBoard k =new KanbanBoard();
//		List<Fiche> listfiche =new ArrayList<Fiche>();
//		listfiche.add(f1);
//		listfiche.add(f2);
//		k.setProprietair(u1);
//		k.setFiches(listfiche);
//		
//		kdao.save(k);
		
	List<Fiche>	fich = kdao.getFicheBug(4);
		
    for(Fiche a:fich) {
    	System.out.println(a.getId());
    }
		
		
		
		
		
		
}


}
