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
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class responsableverif extends Application {
	
	@FXML
	private Label lblstatus;
	@FXML
	private TextField txtusername ;
	@FXML
	private TextField txtpassword ;
@FXML
	public void login(ActionEvent event) throws Exception
	{
	
	
	lblstatus.setText("Login Success");

		if (txtusername.getText().equals("user")&& txtpassword.getText().contentEquals("pass")  )
		{
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("responsable.fxml"));
				Stage primaryStage = new Stage();
				Scene scene = new Scene(root);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				primaryStage.setTitle("verification directeur"); 
				primaryStage.setScene(scene);	
				primaryStage.show();

			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			((Stage) lblstatus.getScene().getWindow()).close();

			
		}
		
		
		else {
			lblstatus.setText("Login failed");
			
			Alert alert = new Alert(AlertType.ERROR);
		     alert.setTitle("erreur");
		     alert.setHeaderText(null);
		     alert.setContentText("Login failed");
		     alert.showAndWait();
			
			
		}

	}
@FXML
public void retour (ActionEvent event1){
	
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
		((Stage) lblstatus.getScene().getWindow()).close();

		

	}
@FXML
	public void exit (ActionEvent event1)
		{
			System.exit(0);
		}	

@Override
public void start(Stage primaryStage) throws Exception {
	// TODO Auto-generated method stub
	
}
}
