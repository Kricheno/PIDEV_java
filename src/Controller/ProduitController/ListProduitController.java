package Controller.ProduitController;

import Entities.Produit;
import Service.ProduitService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import util.ConnectionConfiguration;

import javax.persistence.Table;

public class ListProduitController implements Initializable {

    private int CurrentSelected=0;
    @FXML
    private TableView<Produit> TableProduit;

    @FXML
    private TableColumn<Produit, Integer> Id_Produit;

    @FXML
    private TableColumn<Produit,String> Nom_Produit;

    @FXML
    private TableColumn<Produit,String> Image_Produit;

    @FXML
    private TableColumn<Produit, String> Description_Produit;

    @FXML
    private TableColumn<Produit, String> Operation_Produit;

    @FXML
    private TableColumn<Produit, Integer> Id_user;

    @FXML
    private Button btn_modifier;

    @FXML
    private Button btn_ajouter;

    @FXML
    void btn_ajouterProduit(ActionEvent event) throws IOException {

        Stage Stage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("/View/AjoutProduit.fxml"));
        Scene Scene = new Scene(root);
        Stage.setScene(Scene);
        Stage.show();
    }

    @FXML
    void btn_modifierProduit(ActionEvent event) throws IOException {

        if(CurrentSelected!=0){
            Stage Stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("/View/ModifProduit.fxml"));
            Scene Scene = new Scene(root);
            Stage.setScene(Scene);
            Stage.show();
        }else{
            System.out.println("non selected");
        }

    }
    @FXML
    void recup_data(MouseEvent event) {

        Produit p = TableProduit.getSelectionModel().getSelectedItem();
        CurrentSelected = p.getIdProduit();
        System.out.println(CurrentSelected);
    }

    Connection c = ConnectionConfiguration.getInstance().getConnection();
    PreparedStatement pst;

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {


        ProduitService ps = new ProduitService();
        TableProduit.setItems(ps.AfficherPersonne());
        Id_Produit.setCellValueFactory(new PropertyValueFactory<Produit,Integer>("IdProduit"));
        Nom_Produit.setCellValueFactory(new PropertyValueFactory<Produit,String>("NomProduit"));
        Description_Produit.setCellValueFactory(new PropertyValueFactory<Produit,String>("DescriptionProduit"));
        Operation_Produit.setCellValueFactory(new PropertyValueFactory<Produit,String>("OperationProduit"));
        Image_Produit.setCellValueFactory(new PropertyValueFactory<Produit,String>("ImageProduit"));
        Id_user.setCellValueFactory(new PropertyValueFactory<Produit,Integer>("IdUser"));

    }

}
