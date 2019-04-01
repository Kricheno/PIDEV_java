package Controller.ProduitController;

import Entities.Produit;
import Service.ProduitService;
import javafx.embed.swing.SwingFXUtils;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.FileChooser;
import sun.security.krb5.internal.crypto.Des;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;

public class AjoutProduitController implements Initializable {

    @FXML
    private TextField NomProduit;

    @FXML
    private TextArea DescProduit;

    @FXML
    private ChoiceBox<String> OperProduit;

    @FXML
    private Button btn_ajouter;

    @FXML
    private Button btn_image;

    @FXML
    private ImageView ImageView;

    private String NomImage;
    @FXML
    void Image(ActionEvent event) throws IOException {

        FileChooser fc = new FileChooser();
        FileChooser.ExtensionFilter extFilterJPG =
                new FileChooser.ExtensionFilter("JPG files (*.JPG)", "*.JPG");
        FileChooser.ExtensionFilter extFilterjpg =
                new FileChooser.ExtensionFilter("jpg files (*.jpg)", "*.jpg");
        FileChooser.ExtensionFilter extFilterPNG =
                new FileChooser.ExtensionFilter("PNG files (*.PNG)", "*.PNG");
        FileChooser.ExtensionFilter extFilterpng =
                new FileChooser.ExtensionFilter("png files (*.png)", "*.png");
        fc.getExtensionFilters()
                .addAll(extFilterJPG, extFilterjpg, extFilterPNG, extFilterpng);

        File file = fc.showOpenDialog(null);
        NomImage=file.getName();
       // ImageIO.write(SwingFXUtils.fromFXImage(image, null), "png", file);

        BufferedImage bufferedImage = ImageIO.read(file);

        Image image = SwingFXUtils.toFXImage(bufferedImage, null);

        ImageView.setImage(image);



        if(file!=null){

            System.out.println("succes");
            File savedFile = new File("");

        }
    }


    @FXML
    void AjoutProduit(ActionEvent event) {

        ProduitService ps = new ProduitService();
        Produit p = new Produit(NomProduit.getText(), DescProduit.getText(),NomImage,OperProduit.getValue(),2,"non");
        ps.AjouterProduit(p);


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        OperProduit.getItems().addAll("echanger","donner","reparer");
    }
}
