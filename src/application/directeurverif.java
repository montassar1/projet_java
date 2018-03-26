package application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.io.IOException;
import java.io.ObjectInputStream;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
public class directeurverif extends Application {
	
	
	@FXML
	private Label textlabel;
	@FXML
	private TextField textn ;
	@FXML
	private TextField txtp ;
	
	//private Main main;
	@FXML
	public void login(ActionEvent event)
	{
		/* try ( File OutputStream fos = new OutputStream ("responsable.txt");
				ObjectOutputStream oos = new ObjectOutputStream(fos))
		{oos.writeObject(studientlist );}
		catch (FileNotFound Exception e)
		{e.printStackTrace();}
		catch(IOException e)
		{e.printStackTrace();}} */

		/*
try (FileInputStream fis = new FileInputStream("responsable.txt");
		ObjectInputStream ois =new ObjectInputStream(fis) )
{
	ArrayList<responsable> salarie =new (ArrayList<responsable>)ois.readObject();
	for( responsable res : salarie)
	{
		System.out.println(res);
	}
	catch (FileNotFound Exception e)
	{
		e.printStackTrace();
	}
	catch(IOException e)
	{e.printStackTrace();}
	catch( class NotFoundException e)
{e.printStackTrace();}
		
}*/
		 /* Alert alert = new Alert(AlertType.ERROR);
		     alert.setTitle("erreur");
		     alert.setHeaderText(null);
		     alert.setContentText("dirrreeecterrr");
		     alert.showAndWait(); */
	
		if (textn.getText().equals("user")&& txtp.getText().contentEquals("pass")  )
		{
			
			Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource("directeur.fxml"));
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
			
			textlabel.setText("Login Success");
	
			((Stage) txtp.getScene().getWindow()).close();

		}
		
		else {
			

			Alert alert = new Alert(AlertType.ERROR);
		     alert.setTitle("erreur");
		     alert.setHeaderText(null);
		     alert.setContentText("Login failed");
		     alert.showAndWait();
			
			
			textlabel.setText("Login failed");
		}

	}
	@FXML
	public void retour (ActionEvent event){
		
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
		
			
			((Stage) txtp.getScene().getWindow()).close();

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


