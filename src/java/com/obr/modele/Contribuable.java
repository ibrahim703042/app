package com.obr.modele;

import java.util.Date;

public class Contribuable {
	
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String motPasse;
	private String teliphone;
	private String BP;
	private Date date;
	
	public Contribuable() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMotPasse() {
		return motPasse;
	}

	public void setMotPasse(String motPasse) {
		this.motPasse = motPasse;
	}

	public String getTeliphone() {
		return teliphone;
	}

	public void setTeliphone(String teliphone) {
		this.teliphone = teliphone;
	}

	public String getBP() {
		return BP;
	}

	public void setBP(String bP) {
		BP = bP;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	
	

}
