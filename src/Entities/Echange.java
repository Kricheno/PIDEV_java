package Entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Echange {
    private int idEchange;
    private int idUser1;
    private Integer idUser2;
    private int idProduit1;
    private Integer idProduit2;
    private String etatEchange;

    @Id
    @Column(name = "idEchange")
    public int getIdEchange() {
        return idEchange;
    }

    public void setIdEchange(int idEchange) {
        this.idEchange = idEchange;
    }

    @Basic
    @Column(name = "idUser1")
    public int getIdUser1() {
        return idUser1;
    }

    public void setIdUser1(int idUser1) {
        this.idUser1 = idUser1;
    }

    @Basic
    @Column(name = "idUser2")
    public Integer getIdUser2() {
        return idUser2;
    }

    public void setIdUser2(Integer idUser2) {
        this.idUser2 = idUser2;
    }

    @Basic
    @Column(name = "idProduit1")
    public int getIdProduit1() {
        return idProduit1;
    }

    public void setIdProduit1(int idProduit1) {
        this.idProduit1 = idProduit1;
    }

    @Basic
    @Column(name = "idProduit2")
    public Integer getIdProduit2() {
        return idProduit2;
    }

    public void setIdProduit2(Integer idProduit2) {
        this.idProduit2 = idProduit2;
    }

    @Basic
    @Column(name = "EtatEchange")
    public String getEtatEchange() {
        return etatEchange;
    }

    public void setEtatEchange(String etatEchange) {
        this.etatEchange = etatEchange;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Echange echange = (Echange) o;
        return idEchange == echange.idEchange &&
                idUser1 == echange.idUser1 &&
                idProduit1 == echange.idProduit1 &&
                Objects.equals(idUser2, echange.idUser2) &&
                Objects.equals(idProduit2, echange.idProduit2) &&
                Objects.equals(etatEchange, echange.etatEchange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idEchange, idUser1, idUser2, idProduit1, idProduit2, etatEchange);
    }
}
