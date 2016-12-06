package org.formation.webmail.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.formation.webmail.dao.MessageDAO;
import org.formation.webmail.model.Message;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component("messageDAO")
@Transactional
public class MessageDAOImpl implements MessageDAO {

	@PersistenceContext
	private EntityManager entityManager;
	
	public void save(Message message) {
		entityManager.merge(message);

	}

	public List<Message> findAll() {
		String query = "SELECT message FROM Message message";
		String sql = "select * from message";
		List<Message> list  = (List<Message>) entityManager.createQuery(query).getResultList();
		
		return list;
	}

	public void delete(Integer id) {
		Message message = entityManager.find(Message.class, id);
		entityManager.remove(message);

	}

	public Message getById(int id) {
		Message message= entityManager.find(Message.class, id);
		return message;
	}

}
