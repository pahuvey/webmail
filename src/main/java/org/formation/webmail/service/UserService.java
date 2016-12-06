package org.formation.webmail.service;

import java.util.List;


import org.formation.webmail.model.Utilisateur;

public interface UserService {

	
	public void save (Utilisateur utilisateur);
	
	

	public List<Utilisateur> findAll();
	
	public void delete(Integer id);
	
	public Utilisateur getUser(int id);
	
}
