package application;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class nouvelle_comm {
	
	
	@FXML
	private TextField ref ;
	
	@FXML
	private TextField ref1;
	@FXML
	private TextField nom_art1;
	@FXML
	private TextField prix1 ;
	
	
	@FXML
	private TextField couleur1;
	@FXML
	private TextField quant1;
	
	 @FXML
		private Label label;
	

	@FXML
	public void fin_ajout (ActionEvent event)
	{
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("client.fxml"));
			Stage primaryStage = new Stage();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("client"); 
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
	public void ajout (ActionEvent event)
	{
		
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("erreur");
		alert.setHeaderText(null);
		alert.setContentText("ajout est faite correctement");
		alert.showAndWait();
		
		commande com = new commande(0);
		
		int b=Integer.parseInt(ref.getText());
		com.setNum_comm(b);

		article a = new article();
		  int k=Integer.parseInt(ref1.getText());
		  a.setRef(k);
		
		  a.setNom(nom_art1.getText());
	    
	   double j=Double.parseDouble(prix1.getText());
	   a.setPrix(j);
		
	   a.setCouleur(couleur1.getText());
	    int q = Integer.parseInt(quant1.getText());
	    a.setQte(q);
		
		com.ajouterart(a);
		client.ajout_comm(com);
		commande c = com ;
		
		   ObjectOutputStream f;
			try {
				f = new ObjectOutputStream(new FileOutputStream("comm.dat"));
				stockcomm.Charger();
				
			stockcomm.ajout(c);
			stockcomm.enregistrer(f);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		label.setText("l'ajout success ");
	

	}

	
	

	@FXML
	public void exit (ActionEvent event)
	{
		System.exit(0);

	}
}


