package com.formation.parc_materiel;

import java.util.Date;

enum TypeImprimante {
	JET_ENCRE, LASER_NB, JET_ENCRE_COULEUR, LASER_COULEUR, THERMIQUE
}

public class Imprimante extends Equipement {
	public TypeImprimante technologie;

	public TypeImprimante getTechnologie() {
		return technologie;
	}

	public void setTechnologie(TypeImprimante technologie) {
		this.technologie = technologie;
	}

	public Imprimante(String marque, String modele, Date dateAchat, float prixAchat, int garantie) {
		super(marque, modele, dateAchat, prixAchat, garantie);
		// TODO Auto-generated constructor stub
	}

	public Imprimante(String marque, String modele, Date dateAchat, float prixAchat) {
		super(marque, modele, dateAchat, prixAchat);
		// TODO Auto-generated constructor stub
	}

	public Imprimante(String marque, String modele, Date dateAchat) {
		super(marque, modele, dateAchat);
		// TODO Auto-generated constructor stub
	}

	public Imprimante(String marque, String modele) {
		super(marque, modele);
		// TODO Auto-generated constructor stub
	}

}
