package org.formation.webmail.dao;

import java.util.List;

import org.formation.webmail.model.Message;


public interface MessageDAO {

public void save(Message message);
	
	

	public List<Message> findAll();
	
	public void delete(Integer id);

	public Message getById(int id);
	
}
