package application;

import java.io.IOException;
import java.util.ListIterator;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class rech_comm {
	
	@FXML
    private TextField ref_com;

    @FXML
    private TableView<article> tab;

    @FXML
    private TableColumn<?, ?> ref;

    @FXML
    private TableColumn<?, ?> nom;

    @FXML
    private TableColumn<?, ?> prix;

    @FXML
    private TableColumn<?, ?> couleur;

    @FXML
    private TableColumn<?, ?> qte;
	 
	ObservableList<article> listeObser ;
 commande c ;
    
	@FXML
	public void recherche (ActionEvent event)
	{
		//stockcomm.viderliste();
		ref.setCellValueFactory(new PropertyValueFactory<>("ref"));
		nom.setCellValueFactory(new PropertyValueFactory<>("nom"));
		prix.setCellValueFactory(new PropertyValueFactory<>("prix"));
		couleur.setCellValueFactory(new PropertyValueFactory<>("couleur"));
		qte.setCellValueFactory(new PropertyValueFactory<>("qte"));
		
		
	/*	ListIterator <commande> it= stockcomm.getListC().listIterator(); 	
		while(it.hasNext())	
		{commande com = it.next();
		int k=Integer.parseInt(ref_com.getText());
		if (com.getNum_comm()==k)
		c=com;
		}*/
		
		int k=Integer.parseInt(ref_com.getText());

		c=client.rechercher_comm(k);
	
		listeObser = FXCollections.observableArrayList(c.getListV());
		tab.setItems( listeObser);
	}

	@FXML
	public void retour (ActionEvent event)
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
			((Stage) ref_com.getScene().getWindow()).close();


		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

	@FXML
	public void exit (ActionEvent event)
	{
		System.exit(0);

	}
	

}
