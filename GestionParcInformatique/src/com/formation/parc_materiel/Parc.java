package com.formation.parc_materiel;

public class Parc {
	public int identifiant;
	public String libelle;
	public Collaborateur gestionnaire;
	Equipement[] equipements = new Equipement[300];

	public void ajoutEquipement(Equipement eq, int position) {
		System.out.println("--Ajouter équipement en position " + position);
		equipements[position] = new Equipement();
		equipements[position].identifiant = eq.identifiant;
		equipements[position].numeroSerie = eq.numeroSerie;
		equipements[position].marque = eq.marque;
		equipements[position].modele = eq.modele;
		equipements[position].dateAchat = eq.dateAchat;
		equipements[position].prixAchat = eq.prixAchat;
		equipements[position].garantie = eq.garantie;
	}

	public void listeEquipement() {
		System.out.println("--Liste des équipements");
		for (int i = 0; i < equipements.length; i++) {
			if (equipements[i] != null) {
				System.out.println(equipements);
				// System.out.println("identifiant : " + equipements[i].identifiant);
				// System.out.println("numeroSerie : " + equipements[i].numeroSerie);
				// System.out.println("marque : " + equipements[i].marque);
				// System.out.println("modele : " + equipements[i].modele);
				// System.out.println("dateAchat : " + equipements[i].dateAchat);
				// System.out.println("prixAchat : " + equipements[i].prixAchat);
				// System.out.println("garantie : " + equipements[i].garantie);
			}
		}
	}

	public void supprEquipement(Equipement eq) {
		System.out.println("--Supprimer équipement ayant identifiant N° " + eq.identifiant);
		for (int i = 0; i < equipements.length; i++) {
			if (equipements[i] != null) {
				if (equipements[i].identifiant == eq.identifiant) {
					equipements[i] = null;
					break;
				}
			}
		}
	}

	public float getGarantieMoyenne() {
		float dureeGarantieMoyenne = 0;
		int compteur = 0;
		System.out.println("--Calcul garantie moyenne");
		for (int i = 0; i < equipements.length; i++) {
			if (equipements[i] != null) {
				dureeGarantieMoyenne = dureeGarantieMoyenne + equipements[i].garantie;
				compteur = compteur + 1;
			}
		}
		return dureeGarantieMoyenne / compteur;
	}

	public float getPrixeMoyen() {
		float PrixMoyen = 0;
		int compteur = 0;
		System.out.println("--Calcul prix moyen des équipements");
		for (int i = 0; i < equipements.length; i++) {
			if (equipements[i] != null) {
				PrixMoyen = PrixMoyen + equipements[i].prixAchat;
				compteur = compteur + 1;
			}
		}
		return PrixMoyen / compteur;
	}

	public double getValeurParc() {
		double valeurParc = 0;
		System.out.println("--Calcul valeur parc");
		for (int i = 0; i < equipements.length; i++) {
			if (equipements[i] != null) {
				valeurParc = valeurParc + equipements[i].prixAchat;
			}
		}
		return valeurParc;
	}

}
