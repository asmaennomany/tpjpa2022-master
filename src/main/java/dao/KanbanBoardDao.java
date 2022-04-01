package dao;

import java.util.List;

import business.Fiche;
import business.KanbanBoard;

public class KanbanBoardDao extends AbstractJpaDao<Long, KanbanBoard> {

	public KanbanBoardDao() {
		super(KanbanBoard.class);
		
	}
	
public List<Fiche> getFicheBug(long etat){
		
		String query = "select k.fiches from KanbanBoard as k";
		
		List<Fiche> resultList = this.entityManager.createQuery(query).getResultList();
		return resultList;
	}


}
