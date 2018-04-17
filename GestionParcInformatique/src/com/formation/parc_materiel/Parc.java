package com.formation.parc_materiel;

/**
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Parc {
	private int identifiant;
	private String libelle;
	private Collaborateur gestionnaire;
	private Equipement[] equipements;

	public Parc() {
		super();
		equipements = new Equipement[300];
	}

	public Parc(int identifiant, String libelle, Collaborateur gestionnaire,
			Equipement[] equipements) {
		super();
		this.identifiant = identifiant;
		this.libelle = libelle;
		this.gestionnaire = gestionnaire;
		this.equipements = equipements;
	}

	public void ajoutEquipement(Equipement eq, int position) {
		if (position < 300) {
			equipements[position] = eq;
			System.out.println("--Equipement added");
		}
	}

	public void listeEquipement() {
		System.out.println("--Equipment list");
		for (int i = 0; i < equipements.length; i++) {
			if (equipements[i] != null) {
				System.out.println(equipements[i]);
			}
		}
	}

	public void supprEquipement(Equipement eq) {
		for (int i = 0; i < equipements.length; i++) {
			if (equipements[i] != null) {
				if (equipements[i].getIdentifiant() == eq.getIdentifiant()) {
					equipements[i] = null;
					System.out.println("--Equipement removed "
							+ eq.getIdentifiant());
				}
			}
		}
	}

	public float getGarantieMoyenne() {
		float dureeGarantieMoyenne = 0;
		int compteur = 0;
		System.out.println("--Warranty average");
		for (int i = 0; i < equipements.length; i++) {
			if (equipements[i] != null) {
				dureeGarantieMoyenne = dureeGarantieMoyenne
						+ equipements[i].getGarantie();
				compteur++;
			}
		}
		return dureeGarantieMoyenne / compteur;
	}

	public float getPrixMoyen() {
		float PrixMoyen = 0;
		int compteur = 0;
		System.out.println("--Price average");
		for (int i = 0; i < equipements.length; i++) {
			if (equipements[i] != null) {
				PrixMoyen = PrixMoyen + equipements[i].getPrixAchat();
				compteur++;
			}
		}
		return PrixMoyen / compteur;
	}

	public double getValeurParc() {
		double valeurParc = 0;
		System.out.println("--Parc value");
		for (int i = 0; i < equipements.length; i++) {
			if (equipements[i] != null) {
				valeurParc = valeurParc + equipements[i].getPrixAchat();
			}
		}
		return valeurParc;
	}

	public String getPrixMoyenFmt() {
		return Outils.getPrixFmt(getPrixMoyen());
	}

	public String getValeurParcFmt() {
		return Outils.getPrixFmt(getValeurParc());
	}
	
	public int getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(int identifiant) {
		this.identifiant = identifiant;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public Collaborateur getGestionnaire() {
		return gestionnaire;
	}

	public void setGestionnaire(Collaborateur gestionnaire) {
		this.gestionnaire = gestionnaire;
	}

	public Equipement[] getEquipements() {
		return equipements;
	}

	public void setEquipements(Equipement[] equipements) {
		this.equipements = equipements;
	}

	



}
