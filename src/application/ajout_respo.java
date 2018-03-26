package application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ajout_respo {
	
	@FXML
	private TextField txtnnom;
	@FXML
	private TextField txtprenom;
	@FXML
	private TextField id ;
	@FXML
	private TextField adresse;
	@FXML
	private TextField salaire;
	
	 @FXML
		private Label lbel;
	
	@FXML
	public void ajout (ActionEvent event){
		responsable res = new responsable(null, null, 0,"k", 0);
		res.setNom(txtnnom.getText());
		res.setPrenom(txtprenom.getText());
		int i = Integer.parseInt(id.getText());
		res.setId(i);
		res.setAdresse(adresse.getText());
	double s = Double.parseDouble(salaire.getText());
	res.setSalaire(s);
		directeur.ajouter_res(res);
		
		stockresponsable.Charger();
		
		stockresponsable.ajout(res);
		ObjectOutputStream f1;

		try {
			f1 = new ObjectOutputStream(new FileOutputStream("resp.dat"));
		
		/*	stockresponsable.Charger();
			
	stockresponsable.ajout(res);*/
		stockresponsable.enregistrer(f1);
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lbel.setText("l'ajout de repo success ");
	}
	@FXML
	public void retour (ActionEvent event){
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("directeur.fxml"));
			Stage primaryStage = new Stage();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("directeur"); 
			primaryStage.setScene(scene);	
			primaryStage.show();

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((Stage) id.getScene().getWindow()).close();

		}
@FXML
	public void exit (ActionEvent event)
		{
			System.exit(0);
		}	
	
}
