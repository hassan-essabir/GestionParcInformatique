package com.formation.parc_materiel;

import java.util.Date;

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Collaborateur {
	private int identifiant;
	private String nom;
	private String prenom;
	private Date dateEmbauche;
	private int age;
	private Equipement[] dotation;

	public Collaborateur() {
		super();
		dotation = new Equipement[300];
	}

	public Collaborateur(int identifiant, String nom, String prenom,
			Date dateEmbauche, int age, Equipement[] dotation) {
		super();
		this.identifiant = identifiant;
		this.nom = nom;
		this.prenom = prenom;
		this.dateEmbauche = dateEmbauche;
		this.age = age;
		this.dotation = dotation;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
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

	public Date getDateEmbauche() {
		return dateEmbauche;
	}

	public void setDateEmbauche(Date dateEmbauche) {
		this.dateEmbauche = dateEmbauche;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Equipement[] getDotation() {
		return dotation;
	}

	public void setDotation(Equipement[] dotation) {
		this.dotation = dotation;
	}

}
