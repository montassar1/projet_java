package application;

import java.io.Serializable;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class personne implements Serializable {
	private String nom ;
	private String prenom ;
	private int id ;
	private String adresse ;

	
	public personne(String nom, String prenom, int id,String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.id = id;
		this.adresse =adresse;
	}
	public personne() {
		// TODO Auto-generated constructor stub
	}

	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom ;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getId() {
		return id;
	}
	public void setId( int id) {
		this.id = id;
	}
	public String getAdresse() {
		return adresse ;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	@Override
	public String toString() {
		return "[" + nom + "," + prenom + ", " + id + "," + adresse + "]";
	}

	
	

}
