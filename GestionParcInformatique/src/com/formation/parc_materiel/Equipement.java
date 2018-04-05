package com.formation.parc_materiel;

import java.util.Calendar;
import java.util.Date;

public class Equipement {
	public int identifiant;
	public String numeroSerie;
	public String marque;
	public String modele;
	public Date dateAchat;
	public float prixAchat;
	public int garantie;

	public String afficheDetailGarantie(Equipement eq) {
		String detailGarantie = null;
		switch (eq.garantie) {
		case 5:
			detailGarantie = "Garantie Etendue";
			break;
		case 3:
			detailGarantie = "Garantie Normale";
			break;
		case 1:
			detailGarantie = "Garantie Minimale";
			break;
		case 0:
			detailGarantie = "Aucune Garantie";
			break;
		default:
			detailGarantie = null;
			break;
		}
		return detailGarantie;
	}

	public boolean isGarantieExpiree() {
		boolean isGarantieExpiree = false;
		// Initialisation d'un calendrier � la date du jour
		Calendar finGarantie = Calendar.getInstance();
		finGarantie.setTime(this.dateAchat);
		finGarantie.add(Calendar.YEAR, garantie);
		// Transfert de la date modifi�e dans un objet date
		Date dateFinGarantie = finGarantie.getTime();

		Date toDay = new Date();

		if (dateFinGarantie.before(toDay)) {
			System.out.println("Garantie valable");
		} else {
			System.out.println("Garantie expir�e");
		}

		return isGarantieExpiree;
	}

	public Equipement(int identifiant, String numeroSerie, String marque, String modele, Date dateAchat,
			float prixAchat, int garantie) {
		super();
		this.identifiant = identifiant;
		this.numeroSerie = numeroSerie;
		this.marque = marque;
		this.modele = modele;
		this.dateAchat = dateAchat;
		this.prixAchat = prixAchat;
		this.garantie = garantie;
	}

	public Equipement() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Equipement [marque=" + marque + ", modele=" + modele + ", dateAchat=" + dateAchat + ", prixAchat="
				+ prixAchat + ", garantie=" + garantie + "]";
	}

}