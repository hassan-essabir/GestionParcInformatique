package com.formation.parc_materiel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demarrage {

	public static void main(String[] args) {
		try {
			System.out.println("--Ajout des équipements");
			ParcMateriel pm = new ParcMateriel();
			DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = null;
			pm.ajoutEquipement(
					new Equipement(1, "E001", "DELL", "Précision", (Date) formatter.parse("07/07/2009"), 1500, 3), 0);
			pm.ajoutEquipement(
					new Equipement(2, "E002", "Canon", "Pixma", (Date) formatter.parse("09/04/2010"), 300, 1), 1);
			pm.ajoutEquipement(new Equipement(3, "E003", "Nokia", "5510", (Date) formatter.parse("03/03/2005"), 200, 1),
					2);
			pm.ajoutEquipement(
					new Equipement(4, "E004", "Apple", "Iphone", (Date) formatter.parse("03/10/2009"), 600, 1), 3);
			pm.ajoutEquipement(
					new Equipement(5, "E005", "HP", "Proliant", (Date) formatter.parse("25/02/2010"), 5000, 5), 4);
			pm.ajoutEquipement(new Equipement(6, "E006", "Sun", "Netra", (Date) formatter.parse("05/06/2004"), 2000, 5),
					5);
			pm.ajoutEquipement(
					new Equipement(7, "E007", "HP", "Pavillon", (Date) formatter.parse("31/07/2008"), 800, 3), 6);
			pm.ajoutEquipement(new Equipement(8, "E008", "Sony", "Vaio", (Date) formatter.parse("09/04/2007"), 1700, 3),
					7);
			pm.ajoutEquipement(
					new Equipement(9, "E009", "Fujitsu", "Primergy", (Date) formatter.parse("05/06/2006"), 3500, 5), 8);
			pm.ajoutEquipement(
					new Equipement(10, "E010", "Fujitsu", "Primergy", (Date) formatter.parse("05/06/2006"), 3500, 5),
					9);
			pm.ajoutEquipement(
					new Equipement(11, "E011", "Fujitsu", "Primergy", (Date) formatter.parse("05/06/2006"), 4000, 5),
					10);

			pm.listeEquipement();

			pm.supprEquipement(
					new Equipement(10, "E010", "Fujitsu", "Primergy", (Date) formatter.parse("05/06/2006"), 3500, 5));

			pm.listeEquipement();

			System.out.println(pm.getGarantieMoyenne());
			System.out.println(pm.getPrixeMoyen());
			System.out.println(pm.getValeurParc());
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
