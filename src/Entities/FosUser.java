package Entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "fos_user", schema = "pidev", catalog = "")
public class FosUser {
    private int id;
    private String username;
    private String usernameCanonical;
    private String email;
    private String emailCanonical;
    private byte enabled;
    private String salt;
    private String password;
    private Timestamp lastLogin;
    private String confirmationToken;
    private Timestamp passwordRequestedAt;
    private String roles;
    private String nom;
    private String prenom;
    private String adresse;
    private String telephone;
    private String photoMembre;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "username_canonical")
    public String getUsernameCanonical() {
        return usernameCanonical;
    }

    public void setUsernameCanonical(String usernameCanonical) {
        this.usernameCanonical = usernameCanonical;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "email_canonical")
    public String getEmailCanonical() {
        return emailCanonical;
    }

    public void setEmailCanonical(String emailCanonical) {
        this.emailCanonical = emailCanonical;
    }

    @Basic
    @Column(name = "enabled")
    public byte getEnabled() {
        return enabled;
    }

    public void setEnabled(byte enabled) {
        this.enabled = enabled;
    }

    @Basic
    @Column(name = "salt")
    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "last_login")
    public Timestamp getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(Timestamp lastLogin) {
        this.lastLogin = lastLogin;
    }

    @Basic
    @Column(name = "confirmation_token")
    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    @Basic
    @Column(name = "password_requested_at")
    public Timestamp getPasswordRequestedAt() {
        return passwordRequestedAt;
    }

    public void setPasswordRequestedAt(Timestamp passwordRequestedAt) {
        this.passwordRequestedAt = passwordRequestedAt;
    }

    @Basic
    @Column(name = "roles")
    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Basic
    @Column(name = "nom")
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Basic
    @Column(name = "prenom")
    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Basic
    @Column(name = "adresse")
    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Basic
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "photo_membre")
    public String getPhotoMembre() {
        return photoMembre;
    }

    public void setPhotoMembre(String photoMembre) {
        this.photoMembre = photoMembre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FosUser fosUser = (FosUser) o;
        return id == fosUser.id &&
                enabled == fosUser.enabled &&
                Objects.equals(username, fosUser.username) &&
                Objects.equals(usernameCanonical, fosUser.usernameCanonical) &&
                Objects.equals(email, fosUser.email) &&
                Objects.equals(emailCanonical, fosUser.emailCanonical) &&
                Objects.equals(salt, fosUser.salt) &&
                Objects.equals(password, fosUser.password) &&
                Objects.equals(lastLogin, fosUser.lastLogin) &&
                Objects.equals(confirmationToken, fosUser.confirmationToken) &&
                Objects.equals(passwordRequestedAt, fosUser.passwordRequestedAt) &&
                Objects.equals(roles, fosUser.roles) &&
                Objects.equals(nom, fosUser.nom) &&
                Objects.equals(prenom, fosUser.prenom) &&
                Objects.equals(adresse, fosUser.adresse) &&
                Objects.equals(telephone, fosUser.telephone) &&
                Objects.equals(photoMembre, fosUser.photoMembre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, usernameCanonical, email, emailCanonical, enabled, salt, password, lastLogin, confirmationToken, passwordRequestedAt, roles, nom, prenom, adresse, telephone, photoMembre);
    }
}
