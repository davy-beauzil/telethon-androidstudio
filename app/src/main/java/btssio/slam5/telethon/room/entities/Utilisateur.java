package btssio.slam5.telethon.room.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "utilisateur")
public class Utilisateur {

    @PrimaryKey(autoGenerate = true)
    private int id;
    private String nom;
    private String prenom;
    private int age;
    private String mail;
    private String mdp;

    public Utilisateur(int id, String nom, String prenom, int age, String mail, String mdp){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.mail = mail;
        this.mdp = mdp;
    }

    @Ignore
    public Utilisateur(String nom, String prenom, int age, String mail, String mdp){
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.mail = mail;
        this.mdp = mdp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getMdp() {
        return mdp;
    }

    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
}
