package application;

import java.util.ArrayList;
import java.util.ListIterator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class client extends personne{
	static commande c ;
	static ArrayList <commande> fact = new ArrayList<>();
	
	//article a;
	/*
	
	@FXML
     private TextField txtref;
    @FXML
    private TextField txtnom_art;
     @FXML
     private TextField prix ;
     @FXML
       private TextField txtcoleur;
     @FXML
     private TextField textquant;
     int k;
	*/
	public client(String nom, String prenom, int id, String adresse) {
		super(nom, prenom, id, adresse);
		// TODO Auto-generated constructor stub
	}
	public static commande rechercher_comm(int ref){
		stockcomm.Charger();
		System.out.println(stockcomm.getListC());
		ListIterator <commande> it= stockcomm.getListC().listIterator(); 	
		while(it.hasNext())	
		{commande com = it.next();
		if (com.getNum_comm()==ref)
			return com;
		}
			return null;
		
	}
	
public static void ajout_comm(commande a){
	fact.add(a);
}
public void supp_comm(commande a)
{
	fact.remove(a);
}
/*@FXML
	public void ajouter_au_comm (ActionEvent event){
	
	  article a = new article();
	   k=Integer.parseInt(txtref.getText());
	a.setRef(k);
	
     a.setNom(txtnom_art.getText());
     
    double j=Double.parseDouble(prix.getText());
     a.setPrix(j);
	
     a.setCouleur(txtcoleur.getText());
     int q = Integer.parseInt(textquant.getText());
     a.setQte(q);
     
     ajout_comm(a);
	
	
	
	}

   @FXML
   public void supp_de_comm (ActionEvent event){

	  article a = new article();
	   k=Integer.parseInt(txtref.getText());
	a.setRef(k);
	
    a.setNom(txtnom_art.getText());
    
   double j=Double.parseDouble(prix.getText());
    a.setPrix(j);
	
    a.setCouleur(txtcoleur.getText());
    int q = Integer.parseInt(textquant.getText());
    a.setQte(q);
    supp_comm(a);
	
}

public void exit (ActionEvent event){
	{
		System.exit(0);
	}*/
}


