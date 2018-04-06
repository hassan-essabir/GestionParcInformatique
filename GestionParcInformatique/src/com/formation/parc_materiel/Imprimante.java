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

	public Imprimante(int identifiant, String numeroSerie, String marque, String modele, Date dateAchat,
			float prixAchat, int garantie) {
		super(identifiant, numeroSerie, marque, modele, dateAchat, prixAchat, garantie, null);
		// TODO Auto-generated constructor stub
	}

}
