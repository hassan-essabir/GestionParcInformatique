package com.formation.parc_materiel;

import java.util.Date;

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Telephone extends Equipement {

	private String numeroAppel;

	public Telephone() {
		super();
	}

	public Telephone(String numeroAppel) {
		super();
		this.setNumeroAppel(numeroAppel);
	}

	public Telephone(int identifiant, String numeroSerie, String marque,
			String modele, Date dateAchat, float prixAchat, int garantie,
			TypeEquipement type, String numeroAppel) {
		super(identifiant, numeroSerie, marque, modele, dateAchat, prixAchat,
				garantie, type);
		this.setNumeroAppel(numeroAppel);
	}

	public String getNumeroAppel() {
		return numeroAppel;
	}

	public void setNumeroAppel(String numeroAppel) {
		this.numeroAppel = numeroAppel;
	}

}
