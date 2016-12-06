package org.formation.webmail.service.impl;

import java.util.List;

import org.formation.webmail.dao.MessageDAO;
import org.formation.webmail.dao.UserDAO;
import org.formation.webmail.model.Message;
import org.formation.webmail.model.Utilisateur;
import org.formation.webmail.service.MessageService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("messsageService")
public class MessageServiceImpl implements MessageService {

	@Autowired
	private MessageDAO messageDAO;
	
	@Autowired
	private UserDAO userDAO;
	
	public void save(Message message) {
		Utilisateur utilisateur = userDAO.getById(1);
		message.setUtilisateur(utilisateur);
		
		messageDAO.save(message);

	}

	public List<Message> findAll() {
		// TODO Auto-generated method stub
		return messageDAO.findAll();
	}

	public void delete(Integer id) {
		messageDAO.delete(id);

	}

	public Message getMessage(int id) {
		// TODO Auto-generated method stub
		return messageDAO.getById(id);
	}

}
