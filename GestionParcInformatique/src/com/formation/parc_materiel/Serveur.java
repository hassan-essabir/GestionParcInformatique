package com.formation.parc_materiel;

import java.util.Date;

public class Serveur extends Ordinateur {

	public String role;

	public Serveur(String marque, String modele, Date dateAchat, float prixAchat, int garantie) {
		super(marque, modele, dateAchat, prixAchat, garantie);
		// TODO Auto-generated constructor stub
	}

	public Serveur(String marque, String modele, Date dateAchat, float prixAchat) {
		super(marque, modele, dateAchat, prixAchat);
		// TODO Auto-generated constructor stub
	}

	public Serveur(String marque, String modele, Date dateAchat) {
		super(marque, modele, dateAchat);
		// TODO Auto-generated constructor stub
	}

	public Serveur(String marque, String modele) {
		super(marque, modele);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Serveur [role=" + role + ", marque=" + marque + ", modele=" + modele + ", dateAchat=" + dateAchat
				+ ", prixAchat=" + prixAchat + ", garantie=" + garantie + "]";
	}

}
