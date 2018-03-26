package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class responsablecontrole extends Application  {
	

    @FXML
    private Button supp;
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		/*// TODO Auto-generated method stub
Parent root = FXMLLoader.load(getClass().getResource("responsable.fxml"));
		
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	    primaryStage.setTitle("responsable"); 
		primaryStage.setScene(scene);	
		primaryStage.show();
	*/}
		@FXML
		public void ajouter_au_stock(ActionEvent event)
		{
			
				Parent root;
				try {
					root = FXMLLoader.load(getClass().getResource("ajout_art.fxml"));
					Stage primaryStage = new Stage();
					Scene scene = new Scene(root);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primaryStage.setTitle("ajout_art"); 
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
	    public void supprimer_de_stock(ActionEvent event)
		{
			
		
				Parent root;
				try {
					root = FXMLLoader.load(getClass().getResource("supp-art.fxml"));
					Stage primaryStage = new Stage();
					Scene scene = new Scene(root);
					scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
					primaryStage.setTitle("supp_art"); 
					primaryStage.setScene(scene);	
					primaryStage.show();

				}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
				((Stage) supp.getScene().getWindow()).close();

			/*responsable r = new responsable(null, null, 0, null, 0);
		article a = new article();
		  int k=Integer.parseInt(txtref1.getText());
		r.a.setRef(k);
		
	    r.a.setNom(txtnom_art1.getText());
	    
	   double j=Double.parseDouble(prix1.getText());
	    r.a.setPrix(j);
		
	    r.a.setCouleur(txtcouleur1.getText());
	    int q = Integer.parseInt(textquant1.getText());
	    r.a.setQte(q);
	    r.supprimerart(a);*/

		}
		@FXML
		public void rech (ActionEvent event)
		{Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("recherche_art.fxml"));
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
		((Stage) supp.getScene().getWindow()).close();

		}
		@FXML
	    public void exit(ActionEvent event)
		{	System.exit(0);

		}
		@FXML
	    public void affichage(ActionEvent event) throws ClassNotFoundException
		{Parent root;
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("affichage_stock.fxml"));
			Stage primaryStage = new Stage();
			root=loader.load();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			affichage_stock c = loader.<affichage_stock>getController();
			c.charger();
			primaryStage.setTitle("affichage_stock"); 
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
		
		    public void retour(ActionEvent event)
			{
			Parent root;
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
	/*	@FXML
		public void facturation(ActionEvent event)
		{	
			 Alert alert = new Alert(AlertType.ERROR);
		     alert.setTitle("erreur");
		     alert.setHeaderText(null);
		     alert.setContentText("dirrreeecterrr");
		     alert.showAndWait();
			
			Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("facturation.fxml"));
			Stage primaryStage = new Stage();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("facturation"); 
			primaryStage.setScene(scene);	
			primaryStage.show();

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((Stage) supp.getScene().getWindow()).close();

			
		}*/
	}


