package org.formation.webmail.dao;

import java.util.List;

import org.formation.webmail.model.Utilisateur;


public interface UserDAO {
	
	
	public void save(Utilisateur user);
	
	

	public List<Utilisateur> findAll();
	
	public void delete(Integer id);

	public Utilisateur getById(int id);
}
