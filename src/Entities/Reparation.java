package Entities;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Date;
import java.util.Objects;

@Entity
public class Reparation {
    private int idReparation;
    private int idProduit;
    private String etatReparation;
    private Date dateReparation;
    private Double prixReparation;
    private Integer idReparateur;

    @Id
    @Column(name = "idReparation")
    public int getIdReparation() {
        return idReparation;
    }

    public void setIdReparation(int idReparation) {
        this.idReparation = idReparation;
    }

    @Basic
    @Column(name = "idProduit")
    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }

    @Basic
    @Column(name = "EtatReparation")
    public String getEtatReparation() {
        return etatReparation;
    }

    public void setEtatReparation(String etatReparation) {
        this.etatReparation = etatReparation;
    }

    @Basic
    @Column(name = "DateReparation")
    public Date getDateReparation() {
        return dateReparation;
    }

    public void setDateReparation(Date dateReparation) {
        this.dateReparation = dateReparation;
    }

    @Basic
    @Column(name = "PrixReparation")
    public Double getPrixReparation() {
        return prixReparation;
    }

    public void setPrixReparation(Double prixReparation) {
        this.prixReparation = prixReparation;
    }

    @Basic
    @Column(name = "idReparateur")
    public Integer getIdReparateur() {
        return idReparateur;
    }

    public void setIdReparateur(Integer idReparateur) {
        this.idReparateur = idReparateur;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reparation that = (Reparation) o;
        return idReparation == that.idReparation &&
                idProduit == that.idProduit &&
                Objects.equals(etatReparation, that.etatReparation) &&
                Objects.equals(dateReparation, that.dateReparation) &&
                Objects.equals(prixReparation, that.prixReparation) &&
                Objects.equals(idReparateur, that.idReparateur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idReparation, idProduit, etatReparation, dateReparation, prixReparation, idReparateur);
    }
}
