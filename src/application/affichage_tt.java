package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class affichage_tt extends Application implements Initializable {

    
	@FXML
	private TableView<responsable> tab;
    @FXML
    private TableColumn<?, ?> TabNom;

    @FXML
    private TableColumn<?, ?> TabPrenom;

    @FXML
    private TableColumn<?, ?> TabCin;
    @FXML
    private TableColumn<?, ?> tabadr;
    @FXML
    private TableColumn<?, ?> tabsal;


	ObservableList<responsable> listeObser ;

public void charger () throws ClassNotFoundException, IOException
{
	//stockresponsable.viderliste();
//stockresponsable.Charger();
	TabNom.setCellValueFactory(new PropertyValueFactory<>("nom"));
	TabPrenom.setCellValueFactory(new PropertyValueFactory<>("prenom"));
	TabCin.setCellValueFactory(new PropertyValueFactory<>("id"));
	tabadr.setCellValueFactory(new PropertyValueFactory<>("adresse"));
	tabsal.setCellValueFactory(new PropertyValueFactory<>("salaire"));
stockresponsable.Charger();

	listeObser = FXCollections.observableArrayList(stockresponsable.getListR());
	tab.setItems(listeObser);

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
		((Stage) tab.getScene().getWindow()).close();

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
@Override
public void initialize(URL arg0, ResourceBundle arg1) {
	// TODO Auto-generated method stub
	
}	

}
