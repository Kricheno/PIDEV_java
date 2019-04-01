package Entities;


public class Demande {
    private int idDemande;
    private int idEchange;
    private String etatDemande;
    private int idUser;


    public int getIdDemande() {
        return idDemande;
    }
    public void setIdDemande(int idDemande) {
        this.idDemande = idDemande;
    }


    public int getIdEchange() {
        return idEchange;
    }
    public void setIdEchange(int idEchange) {
        this.idEchange = idEchange;
    }


    public String getEtatDemande() {
        return etatDemande;
    }
    public void setEtatDemande(String etatDemande) {
        this.etatDemande = etatDemande;
    }


    public int getIdUser() {
        return idUser;
    }
    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }


}
