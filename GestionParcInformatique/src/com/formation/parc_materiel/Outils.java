package com.formation.parc_materiel;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class Outils {

	public static String getDateFmt(Date d) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		return sdf.format(d);
	}

	public static String getPrixFmt(double f) {
		return NumberFormat.getInstance().format(f);
	}

	public static String composeUniqueID(Equipement e) {
		Random r = new Random();
		return e.marque.substring(0,1).toUpperCase() + e.marque.substring(e.marque.length() - 1).toUpperCase()
				+ r.nextInt(99999);
	}
}
