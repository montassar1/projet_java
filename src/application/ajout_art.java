package application;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.ClosedWatchServiceException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ajout_art {

	@FXML
	private TextField txtref1;
	@FXML
	private TextField txtnom_art1;
	@FXML
	private TextField prix1 ;
	@FXML
	private TextField txtcouleur1;
	@FXML
	private TextField textquant1;
	
	 @FXML
		private Label textlabel;
	
	@FXML
	public void ajout (ActionEvent event){
		
		article a = new article();
		  int k=Integer.parseInt(txtref1.getText());
		  a.setRef(k);
		
		  a.setNom(txtnom_art1.getText());
	    
	   double j=Double.parseDouble(prix1.getText());
	   a.setPrix(j);
		
	   a.setCouleur(txtcouleur1.getText());
	    int q = Integer.parseInt(textquant1.getText());
	    a.setQte(q);
	    
	    responsable.ajouterart(a);
	    ObjectOutputStream f;
		try {
			f = new ObjectOutputStream(new FileOutputStream("stock.dat"));
			stockresponsable.Charger();
			
		stockarticle.ajout(a);
		stockarticle.enregistrer(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		textlabel.setText("l'ajout success ");

		
	}
	@FXML
	public void retour (ActionEvent event){
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("responsable.fxml"));
			Stage primaryStage = new Stage();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("responsable"); 
			primaryStage.setScene(scene);	
			primaryStage.show();

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((Stage) prix1.getScene().getWindow()).close();

		}
@FXML
	public void exit (ActionEvent event)
		{
			System.exit(0);
		}	
}
