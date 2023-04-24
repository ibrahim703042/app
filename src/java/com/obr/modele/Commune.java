package com.obr.modele;

public class Commune {

	private int id;
	private String nom;
	private String nomProvince;
	
	public Commune() {
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

	public String getNomProvince() {
		return nomProvince;
	}

	public void setNomProvince(String nomProvince) {
		this.nomProvince = nomProvince;
	}
	
	
}
