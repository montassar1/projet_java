package application;

import java.io.Serializable;

public class article implements Serializable {
	
	private int ref;
	private String nom ;
	private double prix ;
	private String couleur ;
 	private int qte ;
	public article() {
		
	}
	public article(int ref, String nom, double prix, String couleur, int qte) {
		super();
		this.ref = ref;
		this.nom = nom;
		this.prix = prix;
		this.couleur = couleur;
		this.qte = qte;
	}
	public int getRef() {
		return ref;
	}
	public void setRef(int ref) {
		this.ref = ref;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	public String getCouleur() {
		return couleur;
	}
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	public int getQte() {
		return qte;
	}
	public void setQte(int qte) {
		this.qte = qte;
	}
	@Override
	public String toString() {
		return "article [ref=" + ref + ", nom=" + nom + ""
				+ ", prix=" + prix + ", couleur=" + couleur + ", qte=" + qte
				+ "]";
	}
	
	
 	




}