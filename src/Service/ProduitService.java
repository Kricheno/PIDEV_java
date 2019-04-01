package Service;

import Entities.Produit;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import util.ConnectionConfiguration;

import java.sql.*;

public class ProduitService {

    Connection c = ConnectionConfiguration.getInstance().getConnection();

    public void AjouterProduit(Produit P)  {


        try (
                Statement st = c.createStatement()) {

            String req = "INSERT INTO produit(NomProduit, DescriptionProduit, ImageProduit, OperationProduit, IdUser, CorbeilleProduit) values ('"+P.getNomProduit()+"','"+P.getDescriptionProduit()+"','"+P.getImageProduit()+"','"+P.getOperationProduit()+"','"+P.getIdUser()+"','"+P.getCorbeilleProduit()+"')";

            st.executeUpdate(req);
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public ObservableList<Produit> AfficherPersonne(){

        Connection c = ConnectionConfiguration.getInstance().getConnection();
        PreparedStatement pst = null;
        ObservableList<Produit> data = FXCollections.observableArrayList();
        try {
            pst=c.prepareStatement("select * from produit");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        ResultSet rs = null;
        try {
            rs = pst.executeQuery();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        while(true)
        {
            try {
                if (!rs.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            Produit p = null;
            try {
                p = new Produit(rs.getInt(1),rs.getString(2),rs.getString(3),
                        rs.getString(4),rs.getString(5),rs.getInt(6),rs.getString(7));
            } catch (SQLException e) {
                e.printStackTrace();
            }
            data.add(p);

        }
        return data;
    }

}
