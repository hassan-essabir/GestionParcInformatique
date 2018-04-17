package com.formation.parc_materiel;

/**
 * <b>Class description</b>
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Agence {
	private int identifiant;
	private Entreprise entreprise;
	private String libelle;
	private Collaborateur[] collaborateurs;
	private Parc[] parcs;

	public Agence() {
		super();
		collaborateurs = new Collaborateur[300];
		parcs = new Parc[2];
	}

	/**
	 * <b>Constructor description</b>
	 * @param identifiant 
	 * @param entreprise
	 * @param libelle
	 * @param collaborateurs
	 * @param parcs
	 * @return
	 * @see Collaborateur 
	 * @see Parc
	 */
	public Agence(int identifiant, Entreprise entreprise, String libelle,
			Collaborateur[] collaborateurs, Parc[] parcs) {
		super();
		this.identifiant = identifiant;
		this.entreprise = entreprise;
		this.libelle = libelle;
		this.collaborateurs = collaborateurs;
		this.parcs = parcs;
	}

	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Collaborateur[] getCollaborateurs() {
		return collaborateurs;
	}

	public void setCollaborateurs(Collaborateur[] collaborateurs) {
		this.collaborateurs = collaborateurs;
	}

	public Parc[] getParcs() {
		return parcs;
	}

	public void setParcs(Parc[] parcs) {
		this.parcs = parcs;
	}

}
