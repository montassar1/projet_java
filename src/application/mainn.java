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
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class mainn extends Application{
	   @FXML
	    private Button resp;

	@FXML
	public void Responsable (ActionEvent event)
	{
  	Parent root;
	try {
		root = FXMLLoader.load(getClass().getResource("responsableverif.fxml"));
		Stage primaryStage = new Stage();
		Scene scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		primaryStage.setTitle("responsable"); 
		primaryStage.setScene(scene);	
		primaryStage.show();
		((Stage) resp.getScene().getWindow()).close();

	}
	catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	@FXML
	public void Client(ActionEvent event)
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
			((Stage) resp.getScene().getWindow()).close();

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/*Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("client.fxml"));
			Stage primaryStage = new Stage();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("client"); 
			primaryStage.setScene(scene);	
			primaryStage.show();
			//((Stage) resp.getScene().getWindow()).close();

			
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
	//	((Stage) resp.getScene().getWindow()).close();

		//a="client.fxml";
	/*	
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("erreur");
		alert.setHeaderText(null);
		alert.setContentText("clt");
		alert.showAndWait();*/
	}
	@FXML
	public void Directeur (ActionEvent event)
	{
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("directeurverif.fxml"));
			Stage primaryStage = new Stage();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("Directeur"); 
			primaryStage.setScene(scene);	
			primaryStage.show();

		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((Stage) resp.getScene().getWindow()).close();

		/*a="directeurverif.fxml";
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("erreur");
		alert.setHeaderText(null);
		alert.setContentText("dir");
		alert.showAndWait();*/
	}
	
	
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		
		
	
	Parent root = FXMLLoader.load(getClass().getResource("mainn.fxml"));
	
	Scene scene = new Scene(root);
	scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
    primaryStage.setTitle("responsable"); 
	primaryStage.setScene(scene);	
	primaryStage.show();


	}
	public static void main(String[] args) {
		launch(args);
	}
}
