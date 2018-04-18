package com.formation.parc_materiel;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * <b>Classe Demarrage</b>
 * 
 * @author Hassan Essabir
 * @version V18.04
 *
 */
public class Demarrage {

	// private final String SEPARATEUR = "/";

	public static void main(String[] args) {

		// List<Equipement> eqs = new ArrayList<>();
		// HashMap<Integer, Equipement> hash = new HashMap<Integer,
		// Equipement>();

		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

		ParcMateriel pm = new ParcMateriel();
		Ordinateur ord = new Ordinateur();
		ord.setIdentifiant(1);
		ord.setNumeroSerie("E001");
		ord.setMarque("Dell");
		ord.setModele("Précision");
		ord.setGarantie(3);
		try {
			ord.setDateAchat((Date) formatter.parse("07/07/2009"));
		} catch (ParseException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		ord.setPrixAchat(1500);
		ord.setAdresseIP("10.51.1.0");
		// System.out.println(ord.afficheDetailGarantie());
		// System.out.println("garantie expirée O/N : " +
		// (ord.isGarantieExpiree() ?
		// "OUI" : "NON"));
		try {
			pm.ajoutEquipement(ord);
		} catch (EquipementIncompatibleException e3) {
			e3.printStackTrace();
		}

		try {
			ord = new Ordinateur(4, "E004", "DELL", "Laitude",
					(Date) formatter.parse("07/07/2010"), 2000, 5, null,
					"10.51.2.0");
		} catch (ParseException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		try {
			pm.ajoutEquipement(ord);
		} catch (EquipementIncompatibleException e2) {
			e2.printStackTrace();
		}

		try {
			ord = new Ordinateur(2, "E002", "DELL", "Laitude",
					(Date) formatter.parse("07/07/2010"), 2000, 5, null,
					"10.51.2.0");
		} catch (ParseException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		try {
			pm.ajoutEquipement(ord);
		} catch (EquipementIncompatibleException e1) {
			e1.printStackTrace();
		}

		pm.listeEquipement();

		System.out.println("--Recherche ordinateur "
				+ pm.rechercheEquipement(ord.getNumeroSerie()));
		FlotteMobile fm = new FlotteMobile();
		Telephone tel = new Telephone();
		tel.setIdentifiant(3);
		tel.setNumeroSerie("E003");
		tel.setMarque("Nokia");
		tel.setModele("5510");
		tel.setGarantie(1);
		try {
			tel.setDateAchat((Date) formatter.parse("03/03/2005"));
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		tel.setPrixAchat(200);

		try {
			fm.ajoutEquipement(tel);
		} catch (EquipementIncompatibleException e) {
			e.printStackTrace();
		}

		// System.out.println(tel.afficheDetailGarantie());
		// System.out.println("garantie expirée O/N : " +
		// (tel.isGarantieExpiree() ?
		// "OUI" : "NON"));

		fm.listeEquipement();

		// p.supprEquipement(eq);
		// p.listeEquipement();

		// System.out.println(p.getGarantieMoyenne());
		// System.out.println(p.getPrixMoyen());
		// System.out.println(p.getValeurParc());

		Agence ag = new Agence();
		// Collaborateur col = new Collaborateur();

		try {
			ag.ajoutCollaborateur(new Collaborateur(1, "hassan", "hassan",
					(Date) formatter.parse("03/03/2018"), 26, null));
			ag.ajoutCollaborateur(new Collaborateur(1, "hassan", "hassan",
					(Date) formatter.parse("03/03/2018"), 26, null));
			ag.ajoutCollaborateur(new Collaborateur(2, "charon", "charon",
					(Date) formatter.parse("03/03/2018"), 26, null));
			ag.afficheCollaborateurs();
			System.out.println(ag.rechercheCollaborateur("hassan"));
		} catch (ParseException e) {
			e.printStackTrace();
		}

		// System.out.println(eq.afficheDetailGarantie(eq));
		// System.out.println("garantie expirée O/N : " +
		// (eq.isGarantieExpiree() ?
		// "OUI" : "NON"));
		// hash.put(1, eq);
		// eqs.add(eq);
		// eq = new Ordinateur();
		// eq.setIdentifiant(2);
		// eq.setNumeroSerie("E002");
		// eq.setMarque("Canon");
		// eq.setModele("Pixma");
		// eq.setGarantie(1);
		// eq.setDateAchat((Date) formatter.parse("09/04/2010"));
		// eq.setPrixAchat(300);
		// ((Ordinateur) eq).setAdresseIP("10.51.1.1");
		// eqs.add(eq);
		// p.ajoutEquipement(eq);
		// System.out.println(eq.afficheDetailGarantie(eq));
		// System.out.println("garantie expirée O/N : " +
		// (eq.isGarantieExpiree() ?
		// "OUI" : "NON"));
		// eqs.add(eq);
		// hash.put(2, eq);

		// for(Equipement e:eqs){
		// System.out.println(e);
		// }
		//
		// for(Entry<Integer, Equipement> e:hash.entrySet()){
		// System.out.println("clé => " + e.getKey() +", valeur => " +
		// e.getValue());
		// }

		// if(eq instanceof Telephone){
		// System.out.println("Ceci est une télephone");
		// }
		//
		// if(eq instanceof Equipement){
		// System.out.println("Ceci est un équipement");
		// }
		//
		// if(eq instanceof Ordinateur){
		// System.out.println("Ceci est un ordinateur");
		// }

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
