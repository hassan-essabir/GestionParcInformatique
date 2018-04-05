package com.formation.parc_materiel;

import java.util.Date;

public class Demarrage {

	public static void main(String[] args) {
		ParcMateriel pm = new ParcMateriel();
		pm.ajoutEquipement(new Equipement(1, "E001", "DELL", "Précision", new Date(), 1500, 3), 0);
		pm.ajoutEquipement(new Equipement(2, "E002", "Canon", "Pixma", new Date(), 300, 1), 1);
		pm.ajoutEquipement(new Equipement(3, "E003", "Nokia", "5510", new Date(), 200, 1), 2);
		pm.ajoutEquipement(new Equipement(4, "E004", "Apple", "Iphone", new Date(), 600, 1), 3);
		pm.ajoutEquipement(new Equipement(5, "E005", "HP", "Proliant", new Date(), 5000, 5), 4);
		pm.ajoutEquipement(new Equipement(6, "E006", "Sun", "Netra", new Date(), 2000, 5), 5);
		pm.ajoutEquipement(new Equipement(7, "E007", "HP", "Pavillon", new Date(), 800, 3), 6);
		pm.ajoutEquipement(new Equipement(8, "E008", "Sony", "Vaio", new Date(), 1700, 3), 7);
		pm.ajoutEquipement(new Equipement(9, "E009", "Fujitsu", "Primergy", new Date(), 3500, 5), 8);
		pm.ajoutEquipement(new Equipement(10, "E010", "Fujitsu", "Primergy", new Date(), 3500, 5), 9);
		pm.ajoutEquipement(new Equipement(11, "E011", "Fujitsu", "Primergy", new Date(), 3500, 5), 10);
		pm.listeEquipement();
		pm.supprEquipement(new Equipement(10, "E010", "Fujitsu", "Primergy", new Date(), 3500, 5));
		pm.listeEquipement();
		System.out.println(pm.getGarantieMoyenne());
		System.out.println(pm.getPrixeMoyen());
		System.out.println(pm.getValeurParc());
	}

}
