package org.formation.webmail.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import org.formation.webmail.dao.UserDAO;
import org.formation.webmail.model.Utilisateur;

@Component("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

		@PersistenceContext
		private EntityManager entityManager;
		
		
	

	public void save(Utilisateur utilisateur) {
		entityManager.merge(utilisateur);

	}

	

	public List<Utilisateur> findAll() {
		String query = "SELECT utilisateur FROM Utilisateur utilisateur";
		String sql = "select * from utilisateur";
		List<Utilisateur> list  = (List<Utilisateur>) entityManager.createQuery(query).getResultList();
		
		return list;
	}
	
	public void delete(Integer id){
		Utilisateur utilisateur = entityManager.find(Utilisateur.class, id);
		entityManager.remove(utilisateur);
	}

}
