package com.formation.parc_materiel;

import java.util.Date;

public class Telephone extends Equipement {
	public Telephone(int identifiant, String numeroSerie, String marque, String modele, Date dateAchat,
			float prixAchat, int garantie) {
		super(identifiant, numeroSerie, marque, modele, dateAchat, prixAchat, garantie);
		// TODO Auto-generated constructor stub
	}

	public String numeroAppel;

}
