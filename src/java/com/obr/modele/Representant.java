package com.obr.modele;

import java.util.Date;

public class Representant {
	
	private int id;
	private String nom;
	private String prenom;
	private String email;
	private String teliphone;
	private String nomComplet_Contribuable;
	private String BP;
	private Date date;
	
	public Representant() {
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

	public String getTeliphone() {
		return teliphone;
	}

	public void setTeliphone(String teliphone) {
		this.teliphone = teliphone;
	}

	public String getNomComplet_Contribuable() {
		return nomComplet_Contribuable;
	}

	public void setNomComplet_Contribuable(String nomComplet_Contribuable) {
		this.nomComplet_Contribuable = nomComplet_Contribuable;
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
