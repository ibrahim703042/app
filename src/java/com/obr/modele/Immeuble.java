package com.obr.modele;

public class Immeuble {
	
	private int id;
	private String nomComplet_contribuable;
	private String nomAvenue;
	
	public Immeuble() {
		super();
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomComplet_contribuable() {
		return nomComplet_contribuable;
	}

	public void setNomComplet_contribuable(String nomComplet_contribuable) {
		this.nomComplet_contribuable = nomComplet_contribuable;
	}

	public String getNomAvenue() {
		return nomAvenue;
	}

	public void setNomAvenue(String nomAvenue) {
		this.nomAvenue = nomAvenue;
	}
	
	
}
