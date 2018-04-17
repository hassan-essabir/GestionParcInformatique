package com.formation.parc_materiel;

import java.util.Date;

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Ordinateur extends Equipement {

	private String adresseIP;

	public Ordinateur() {
		super();
	}

	public Ordinateur(String adresseIP) {
		super();
		this.setAdresseIP(adresseIP);
	}

	public Ordinateur(int identifiant, String numeroSerie, String marque,
			String modele, Date dateAchat, float prixAchat, int garantie,
			TypeEquipement type, String adresseIP) {
		super(identifiant, numeroSerie, marque, modele, dateAchat, prixAchat,
				garantie, type);
		this.setAdresseIP(adresseIP);
	}
	

	public String getAdresseIP() {
		return adresseIP;
	}

	public void setAdresseIP(String adresseIP) {
		this.adresseIP = adresseIP;
	}

}
