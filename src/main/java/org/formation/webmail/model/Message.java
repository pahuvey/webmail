package org.formation.webmail.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;



import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Message {

	@Id
	@Column(name="msgid")
	@GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int msgid;
	@Column(name="objet")
	private String objet;
	@Column(name="message")
	private String message;
	
	@ManyToOne
	@JsonBackReference
	private Utilisateur utilisateur;
	
	
	public int getMsgid() {
		return msgid;
	}
	public void setMsgid(int msgid) {
		this.msgid = msgid;
	}
	public String getObjet() {
		return objet;
	}
	public void setObjet(String objet) {
		this.objet = objet;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
}
