package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class clientController extends Application{

    @FXML
    private Button supp;
	
    int k=0;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("client.fxml"));
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    primaryStage.setTitle("responsable"); 
		primaryStage.setScene(scene);	
		primaryStage.show();

	}
	@FXML
	public void ajouter_au_comm (ActionEvent event)
	
	{Parent root;
	try {
		root = FXMLLoader.load(getClass().getResource("ajouter_comm.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("ajouter au commande"); 
		primaryStage.setScene(scene);	
		primaryStage.show();

	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	((Stage) supp.getScene().getWindow()).close();


		
		/*commande c =new commande(k);
	article a = new article();
	  int k=Integer.parseInt(txtref.getText());
	a.setRef(k);
	
  a.setNom(txtnom_art.getText());
  
 double j=Double.parseDouble(prix.getText());
  a.setPrix(j);
	
  a.setCouleur(txtcoleur.getText());
  int q = Integer.parseInt(textquant.getText());
  a.setQte(q);
  
  c.ajouterart(a);
	((Stage) prix.getScene().getWindow()).close();
k++;*/
	}
	
	@FXML
	public void facteur (ActionEvent event)
	
	{Parent root;
	try {
		root = FXMLLoader.load(getClass().getResource("rech_comm.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("rech_commande"); 
		primaryStage.setScene(scene);	
		primaryStage.show();

	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	((Stage) supp.getScene().getWindow()).close();// redendance des fenetre  

	}
	@FXML
	public void nouvelle_comm (ActionEvent event)
	{Parent root;
	try {
		root = FXMLLoader.load(getClass().getResource("nouvelle_comm.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("nouvelle commande"); 
		primaryStage.setScene(scene);	
		primaryStage.show();

	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		
	((Stage) supp.getScene().getWindow()).close();

	}

	
	
	@FXML
	public void retour (ActionEvent event)
	{Parent root;
	try {
		root = FXMLLoader.load(getClass().getResource("mainn.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("main"); 
		primaryStage.setScene(scene);	
		primaryStage.show();

	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		
		((Stage) supp.getScene().getWindow()).close();

	}
	@FXML
	public void exit(ActionEvent event)
	{System.exit(0);

		
	}
	
}
