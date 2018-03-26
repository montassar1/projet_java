package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

public class affichage_stock extends Application {

	@FXML
	private TableView<article> tabb;
    @FXML
    private TableColumn<?, ?> tabref;

    @FXML
    private TableColumn<?, ?> tabnomm;

    @FXML
    private TableColumn<?, ?> tabprix;
    @FXML
    private TableColumn<?, ?> tabcoul;
    @FXML
    private TableColumn<?, ?> tabqte;


	ObservableList<article> listeObser ;

public void charger () throws ClassNotFoundException, IOException
{
	//stockresponsable.viderliste();
	stockresponsable.Charger();
	tabref.setCellValueFactory(new PropertyValueFactory<>("ref"));
	tabnomm.setCellValueFactory(new PropertyValueFactory<>("nom"));
	tabprix.setCellValueFactory(new PropertyValueFactory<>("prix"));
	tabcoul.setCellValueFactory(new PropertyValueFactory<>("couleur"));
	tabqte.setCellValueFactory(new PropertyValueFactory<>("qte"));
	stockarticle.Charger();
	listeObser = FXCollections.observableArrayList(stockarticle.getListA());
	tabb.setItems(listeObser);

}
	
	@FXML
	public void retour (ActionEvent event){
		
		Parent root;
		try {
			root = FXMLLoader.load(getClass().getResource("responsable.fxml"));
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
		((Stage) tabb.getScene().getWindow()).close();

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
