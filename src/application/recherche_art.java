package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class recherche_art extends Application {

	
	@FXML
	private TextField ref;
	@FXML
	private Label lblstat;

	@FXML
	public void rechercher(ActionEvent event) {
		
		int k = Integer.parseInt(ref.getText());

		article a = responsable.rechercher(k);
		lblstat.setText(a.toString());
	
		
		
		
		//((Stage) ref.getScene().getWindow()).close();

	}

	@FXML
	public void exit(ActionEvent event) {
		System.exit(0);
	}

	@FXML
	public void retour(ActionEvent event) {
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("responsable.fxml"));
			Stage primaryStage = new Stage();
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			primaryStage.setTitle("responsable");
			primaryStage.setScene(scene);
			primaryStage.show();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		((Stage) ref.getScene().getWindow()).close();

	}

	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub

	}

}
