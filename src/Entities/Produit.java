package Entities;

public class Produit {
    private int idProduit;
    private String nomProduit;
    private String descriptionProduit;
    private String imageProduit;
    private String operationProduit;
    private int idUser;
    private String corbeilleProduit;


    public int getIdProduit() {
        return idProduit;
    }

    public void setIdProduit(int idProduit) {
        this.idProduit = idProduit;
    }


    public String getNomProduit() {
        return nomProduit;
    }

    public void setNomProduit(String nomProduit) {
        this.nomProduit = nomProduit;
    }


    public String getDescriptionProduit() {
        return descriptionProduit;
    }

    public void setDescriptionProduit(String descriptionProduit) {
        this.descriptionProduit = descriptionProduit;
    }


    public String getImageProduit() {
        return imageProduit;
    }

    public void setImageProduit(String imageProduit) {
        this.imageProduit = imageProduit;
    }


    public String getOperationProduit() {
        return operationProduit;
    }

    public void setOperationProduit(String operationProduit) {
        this.operationProduit = operationProduit;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getCorbeilleProduit() {
        return corbeilleProduit;
    }

    public void setCorbeilleProduit(String corbeilleProduit) {
        this.corbeilleProduit = corbeilleProduit;
    }

    public Produit(int idProduit, String nomProduit, String descriptionProduit, String imageProduit, String operationProduit, int idUser, String corbeilleProduit) {
        this.idProduit = idProduit;
        this.nomProduit = nomProduit;
        this.descriptionProduit = descriptionProduit;
        this.imageProduit = imageProduit;
        this.operationProduit = operationProduit;
        this.idUser = idUser;
        this.corbeilleProduit = corbeilleProduit;
    }
    public Produit( String nomProduit, String descriptionProduit, String imageProduit, String operationProduit, int idUser, String corbeilleProduit) {

        this.nomProduit = nomProduit;
        this.descriptionProduit = descriptionProduit;
        this.imageProduit = imageProduit;
        this.operationProduit = operationProduit;
        this.idUser = idUser;
        this.corbeilleProduit = corbeilleProduit;
    }
}
