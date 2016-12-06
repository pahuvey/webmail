package org.formation.webmail.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
@Table(name="utilisateur")
public class Utilisateur {
	
	
	
	@Id 
	@Column(name="userid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int id;
	@Column(name="firstname")
	private String firstName;
	@Column(name="lastname")
	private String lastName;
	@Column(name="password")
	private String password;
	@Column(name="pseudo")
	private String pseudo;
	
	
	
	
	@OneToMany(mappedBy="utilisateur", fetch=FetchType.EAGER)
	@JsonManagedReference
	private Set<Message> messages;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String pasword) {
		this.password = pasword;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public Set<Message> getMessages() {
		return messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}
	
}
