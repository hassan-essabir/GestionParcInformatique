package com.formation.parc_materiel;

import java.util.Calendar;
import java.util.Date;

enum TypeEquipement {
	FIXE, PORTABLE
}

public class Equipement {
	public int identifiant;
	public String numeroSerie;
	public String marque;
	public String modele;
	public Date dateAchat;
	public float prixAchat;
	public int garantie;
	public TypeEquipement type;

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
		// Initialisation d'un calendrier à la date du jour
		Calendar finGarantie = Calendar.getInstance();
		finGarantie.setTime(this.dateAchat);
		finGarantie.add(Calendar.YEAR, garantie);
		// Transfert de la date modifiée dans un objet date
		Date dateFinGarantie = finGarantie.getTime();

		Date toDay = new Date();

		if (dateFinGarantie.before(toDay)) {
			System.out.println("Garantie valable");
		} else {
			System.out.println("Garantie expirée");
		}

		return isGarantieExpiree;
	}

	public static double conversionUSD(double prix) {
		double prixUSD = 0;
		prixUSD = prix * 1.20;
		return prixUSD;
	}

	public Equipement(int identifiant, String numeroSerie, String marque, String modele, Date dateAchat,
			float prixAchat, int garantie, TypeEquipement type) {
		super();
		this.identifiant = identifiant;
		this.numeroSerie = numeroSerie;
		this.marque = marque;
		this.modele = modele;
		this.dateAchat = dateAchat;
		this.prixAchat = prixAchat;
		this.garantie = garantie;
		this.type = type;
	}

	public Equipement() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Equipement [identifiant=" + identifiant + ", numeroSerie=" + numeroSerie + ", marque=" + marque
				+ ", modele=" + modele + ", dateAchat=" + dateAchat + ", prixAchat=" + prixAchat + "|"
				+ conversionUSD(prixAchat) + ", garantie=" + garantie + ", type=" + getType() + "]";
	}

	public TypeEquipement getType() {
		return type;
	}

	public void setType(TypeEquipement type) {
		this.type = type;
	}

}
