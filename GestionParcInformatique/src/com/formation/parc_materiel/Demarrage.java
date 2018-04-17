package com.formation.parc_materiel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

/**
 * <b>Classe Demarrage</b>
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Demarrage {

	//private final String SEPARATEUR = "/";

	public static void main(String[] args) throws Exception {

//		ArrayList<Equipement> eqs = new ArrayList<Equipement>();
//		HashMap<Integer, Equipement> hash = new HashMap<Integer, Equipement>();
		
		ParcMateriel p = new ParcMateriel();

		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Equipement eq = new Equipement();
		eq.setIdentifiant(1);
		eq.setNumeroSerie("E001");
		eq.setMarque("Dell");
		eq.setModele("Précision");
		eq.setGarantie(3);
		eq.setDateAchat((Date) formatter.parse("07/07/2009"));
		eq.setPrixAchat(1500);
		p.ajoutEquipement(eq, 0);
		System.out.println(eq.afficheDetailGarantie(eq));
		System.out.println("garantie expirée O/N : "
				+ (eq.isGarantieExpiree() ? "OUI" : "NON"));
//		hash.put(1, eq);
//		eqs.add(eq);
		eq = new Ordinateur();
		eq.setIdentifiant(2);
		eq.setNumeroSerie("E002");
		eq.setMarque("Canon");
		eq.setModele("Pixma");
		eq.setGarantie(1);
		eq.setDateAchat((Date) formatter.parse("09/04/2010"));
		eq.setPrixAchat(300);
		((Ordinateur)eq).setAdresseIP("sds");
		p.ajoutEquipement(eq, 1);
		System.out.println(eq.afficheDetailGarantie(eq));
		System.out.println("garantie expirée O/N : "
				+ (eq.isGarantieExpiree() ? "OUI" : "NON"));
//		eqs.add(eq);
//		hash.put(2, eq);
		eq = new Equipement();
		eq.setIdentifiant(3);
		eq.setNumeroSerie("E003");
		eq.setMarque("Nokia");
		eq.setModele("5510");
		eq.setGarantie(1);
		eq.setDateAchat((Date) formatter.parse("03/03/2005"));
		eq.setPrixAchat(200);
		p.ajoutEquipement(eq, 2);
//		eqs.add(eq);
//		hash.put(3, eq);
		System.out.println(eq.afficheDetailGarantie(eq));
		System.out.println("garantie expirée O/N : "
				+ (eq.isGarantieExpiree() ? "OUI" : "NON"));
		
//		for(Equipement e:eqs){
//			System.out.println(e);
//		}
//		
//		for(Entry<Integer, Equipement> e:hash.entrySet()){
//			System.out.println("clé => " + e.getKey() +", valeur => " + e.getValue());
//		}
		
//		if(eq instanceof Telephone){
//			System.out.println("Ceci est une télephone");
//		}
//		
//		if(eq instanceof Equipement){
//			System.out.println("Ceci est un équipement");
//		}
//		
//		if(eq instanceof Ordinateur){
//			System.out.println("Ceci est un ordinateur");
//		}
		
		//p.listeEquipement();
		//p.supprEquipement(eq);
		//p.listeEquipement();

		System.out.println(p.getGarantieMoyenne());
		System.out.println(p.getPrixMoyen());
		System.out.println(p.getValeurParc());

		// pm.ajoutEquipement(new Equipement(1, "E001", "DELL", "Précision",
		// (Date) formatter.parse("07/07/2009"),
		// 1500, 3, TypeEquipement.ORDINATEUR), 0);
		//
		// pm.ajoutEquipement(new Equipement(2, "E002", "Canon", "Pixma", (Date)
		// formatter.parse("09/04/2010"), 300, 1,
		// TypeEquipement.PORTABLE), 1);
		//
		// pm.ajoutEquipement(new Equipement(3, "E003", "Nokia", "5510", (Date)
		// formatter.parse("03/03/2005"), 200, 1,
		// TypeEquipement.PORTABLE), 2);
		//
		// pm.ajoutEquipement(new Equipement(4, "E004", "Apple", "Iphone",
		// (Date) formatter.parse("03/10/2009"), 600,
		// 1, TypeEquipement.PORTABLE), 3);
		//
		// pm.ajoutEquipement(new Equipement(5, "E005", "HP", "Proliant", (Date)
		// formatter.parse("25/02/2010"), 5000,
		// 5, TypeEquipement.FIXE), 4);
		//
		// pm.ajoutEquipement(new Equipement(6, "E006", "Sun", "Netra", (Date)
		// formatter.parse("05/06/2004"), 2000, 5,
		// TypeEquipement.FIXE), 5);
		//
		// pm.ajoutEquipement(new Equipement(7, "E007", "HP", "Pavillon", (Date)
		// formatter.parse("31/07/2008"), 800, 3,
		// TypeEquipement.FIXE), 6);
		//
		// pm.ajoutEquipement(new Equipement(8, "E008", "Sony", "Vaio", (Date)
		// formatter.parse("09/04/2007"), 1700, 3,
		// TypeEquipement.FIXE), 7);
		//
		// pm.ajoutEquipement(new Equipement(9, "E009", "Fujitsu", "Primergy",
		// (Date) formatter.parse("05/06/2006"),
		// 3500, 5, TypeEquipement.FIXE), 8);
		//
		// pm.ajoutEquipement(new Equipement(10, "E010", "Fujitsu", "Primergy",
		// (Date) formatter.parse("05/06/2006"),
		// 3500, 5, TypeEquipement.FIXE), 9);
		//
		// pm.ajoutEquipement(new Equipement(11, "E011", "Fujitsu", "Primergy",
		// (Date) formatter.parse("05/06/2006"),
		// 4000, 5, TypeEquipement.FIXE), 10);
		//
		// pm.ajoutEquipement(new Equipement("Fujitsu", "Primergy", (Date)
		// formatter.parse("05/06/2006"), 4000, 5),
		// 11);
		//

	}
}
