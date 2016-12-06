package org.formation.webmail.controller;

import java.util.List;

import org.formation.webmail.model.Message;
import org.formation.webmail.model.Utilisateur;
import org.formation.webmail.service.MessageService;
import org.formation.webmail.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
public class MessageController {

	@Autowired
	private MessageService messageService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Message> listMessages(){
		return messageService.findAll();
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public void add(@RequestBody Message message){
		
		messageService.save(message);
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id){
		messageService.delete(id);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public Message message(@PathVariable("id") Integer id){
		return messageService.getMessage(id);
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public void update(@PathVariable("id") Integer id, @RequestBody Message message ){
		message.setMsgid(id);
		messageService.save(message);
		
	}
	
	
}
