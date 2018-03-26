package application;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class supp_respo extends Application {

	@FXML
	TextField refe ;
	
	 @FXML
		private Label textlabel;
	
	@FXML
	public void supp (ActionEvent event){
		
		  int k=Integer.parseInt(refe.getText());
			 
		    ObjectOutputStream f;

		  try {
			  stockresponsable.Charger();
				 responsable	a=	directeur.rechercher( k);
				  stockresponsable.supprimer(a);

			f = new ObjectOutputStream(new FileOutputStream("resp.dat"));
			// article	a=	responsable. rechercher( k);
			//stockresponsable.Charger();
			
			//  stockarticle.supprimer(a);
				stockresponsable.enregistrer(f);

			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}			
		 
			textlabel.setText("suppression Success");

		
		
		

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
		((Stage) refe.getScene().getWindow()).close();

	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
@FXML
	public void exit (ActionEvent event)
		{
			System.exit(0);
		}
@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	
}	
	
}
