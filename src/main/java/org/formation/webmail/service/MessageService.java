package org.formation.webmail.service;

import java.util.List;

import org.formation.webmail.model.Message;


public interface MessageService {
	
public void save (Message message);
	
	

	public List<Message> findAll();
	
	public void delete(Integer id);
	
	public Message getMessage(int id);

}
