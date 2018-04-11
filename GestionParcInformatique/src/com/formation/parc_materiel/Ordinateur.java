package com.formation.parc_materiel;

import java.util.Date;

public class Ordinateur extends Equipement {

	public Ordinateur(String marque, String modele, Date dateAchat, float prixAchat, int garantie) {
		super(marque, modele, dateAchat, prixAchat, garantie);
		// TODO Auto-generated constructor stub
	}

	public Ordinateur(String marque, String modele, Date dateAchat, float prixAchat) {
		super(marque, modele, dateAchat, prixAchat);
		// TODO Auto-generated constructor stub
	}

	public Ordinateur(String marque, String modele, Date dateAchat) {
		super(marque, modele, dateAchat);
		// TODO Auto-generated constructor stub
	}

	public Ordinateur(String marque, String modele) {
		super(marque, modele);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Ordinateur [marque=" + marque + ", modele=" + modele + ", dateAchat=" + dateAchat + ", prixAchat="
				+ prixAchat + ", garantie=" + garantie + "]";
	}

	public String adresseIP;

}
