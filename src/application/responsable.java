package application;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class responsable extends personne implements Serializable {

	private double salaire;
	
	
	
	
	public responsable(String nom, String prenom, int id, String adresse, double salaire) {
		
		super(nom,prenom,id,adresse);
		
		this.salaire = salaire;
	}



	static article a;
static ArrayList <article> stock = new ArrayList<>();








public double getSalaire() {
	return salaire;
}

public void setSalaire(double salaire) {
	this.salaire = salaire;
}


@Override
public String toString() {
	return "salaire=" + salaire  + super.toString() + "]";
}

public static article rechercher( int ref){
	stockarticle.Charger();

ListIterator <article> it= stockarticle.getListA().listIterator(); 	
while(it.hasNext())	
{article ar = it.next();
if (ar.getRef()==ref)
	a=ar;
}
	return a;
	
}
public static void ajouterart(article a)
{
	stock.add(a);
}

public static void supprimerart(article a)
{stock.remove(a);
}



}
