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

public class recher_resp extends Application{
	@FXML
    private TextField rech_id;
	@FXML
	private Label lblstatt;

@FXML
	public void rechercher (ActionEvent event){
	
	 int k=Integer.parseInt(rech_id.getText());
		
	responsable re=	directeur. rechercher( k);
	lblstatt.setText(re.toString());
	//((Stage) rech_id.getScene().getWindow()).close();

		}

@FXML
	public void exit (ActionEvent event)
		{
			System.exit(0);
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
	((Stage) rech_id.getScene().getWindow()).close();

}
	
	@Override
	public void start(Stage arg0) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
