package org.formation.webmail.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.formation.webmail.model.Utilisateur;
import org.formation.webmail.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserService userService;
	
	
	@RequestMapping(method=RequestMethod.GET)
	public List<Utilisateur> listUtilisateurs(){
		return userService.findAll();
	}
	
	
	@RequestMapping(method=RequestMethod.POST)
	public void add(@RequestBody Utilisateur utilisateur){
		
		userService.save(utilisateur);
		
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.DELETE)
	public void delete(@PathVariable("id") Integer id){
		userService.delete(id);
	}
	


}
