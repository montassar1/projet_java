package application;

import java.util.ArrayList;
import java.util.ListIterator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class directeur extends personne {

	static responsable res;

	public directeur(String nom, String prenom, int id, String adresse) 
	{
		super(nom, prenom, id, adresse);
		// TODO Auto-generated constructor stub
	}

	 static ArrayList<responsable> salarie = new ArrayList<>();

	 
	public static void ajouter_res(responsable r) {
		salarie.add(r);
		System.out.println(salarie);
	}

	public void supp_res(responsable r) {
		salarie.add(r);
	}
	public static responsable rechercher( int id){

		stockresponsable.Charger();

		ListIterator<responsable> it= stockresponsable.getListR().listIterator(); 	
		while(it.hasNext())	
		{responsable ar = it.next();
		if (ar.getId()==id)
			res=ar;
		}
			return res;
			
		}

	/*
	 * public responsable rech_res(int id){
	 * 
	 * ListIterator <responsable> it= salarie.listIterator();
	 * while(it.hasNext()) {responsable res = it.next(); if (res.getRef()==id)
	 * responsable a=res; } return a; return res;
	 */

	@Override
	public String toString() {
		return "directeur [toString()=" + super.toString() + "]";
	}

}
