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
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class directeurcontrole extends Application {
	  @FXML
	    private Button re;

	
	@Override
	public void start(Stage primaryStage) throws Exception {
		
		
			Parent root = FXMLLoader.load(getClass().getResource("directeur.fxml"));
			
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		    primaryStage.setTitle("responsable"); 
			primaryStage.setScene(scene);	
			primaryStage.show();

		}
		// TODO Auto-generated method stub
	@FXML	
	public void ajout_responsable (ActionEvent event)
	{ 
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("ajout_respo.fxml"));
			Stage primaryStage = new Stage();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("ajout_respo"); 
			primaryStage.setScene(scene);	
			primaryStage.show();

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		((Stage) re.getScene().getWindow()).close();

	
	
		
	}
	@FXML
	public void supp_responsable (ActionEvent event)
	{
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("supp-repo.fxml"));
			Stage primaryStage = new Stage();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("supp_respo"); 
			primaryStage.setScene(scene);	
			primaryStage.show();

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((Stage) re.getScene().getWindow()).close();

		/*directeur d = new directeur(null, null, 0, null);
			responsable res = new responsable (null, null, 0, null, 0);
			d.res.setPrenom(txtnnom.getText());
			d.res.setNom(txtprenom.getText());
			int i = Integer.parseInt(id.getText());
			d.res.setId(i);
			d.res.setAdresse(adresse.getText());
			double s = Double.parseDouble(salaire.getText());
			d.res.setSalaire(s);
			
			
			d.supp_res(res);	*/
	}
	@FXML
	public void rech (ActionEvent event)
	{Parent root;
	try {
		root = FXMLLoader.load(getClass().getResource("rech_respo.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("rech_respo"); 
		primaryStage.setScene(scene);	
		primaryStage.show();

	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	((Stage) re.getScene().getWindow()).close();

	}
	@FXML
	public void exit (ActionEvent event)
	{
		System.exit(0);
	}
	@FXML
	public void affichage (ActionEvent event) throws ClassNotFoundException
	{Parent root;
	try {
		
		FXMLLoader loader = new FXMLLoader(getClass().getResource("affichage_tt.fxml"));
		Stage primaryStage = new Stage();
		
		root=loader.load();
		//Scene scene = new Scene(root);

		
		Scene scene = new Scene(root);
		primaryStage.setScene(scene);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());

		affichage_tt c = loader.<affichage_tt>getController();
		c.charger();
		primaryStage.setTitle("afffichage _tt_reponsable"); 
		primaryStage.setScene(scene);	
		primaryStage.show();
		
		/*FXMLLoader loader = new FXMLLoader(getClass().getResource("affichage_stock.fxml"));
		Stage primaryStage = new Stage();
		root=loader.load();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		affichage_stock c = loader.<affichage_stock>getController();
		c.charger();
		primaryStage.setTitle("affichage_stock"); 
		primaryStage.setScene(scene);	
		primaryStage.show();*/



	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	((Stage) re.getScene().getWindow()).close();

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
		((Stage) re.getScene().getWindow()).close();

		}
		
	}
	


