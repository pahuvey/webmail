package org.formation.webmail.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.formation.webmail.dao.UserDAO;
import org.formation.webmail.model.Utilisateur;
import org.formation.webmail.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDAO userDAO;
	
	

	public void save(Utilisateur utilisateur) {
		userDAO.save(utilisateur);

	}

	

	public List<Utilisateur> findAll() {
		// TODO Auto-generated method stub
		return userDAO.findAll();
	}
	
	public void delete(Integer id){
		userDAO.delete(id);
	}

}

