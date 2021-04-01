package btssio.slam5.telethon.room.entities;

import androidx.room.Entity;
import androidx.room.Ignore;

@Entity(tableName = "visiteur")
public class Visiteur extends Utilisateur{

    private String profession;
    private Boolean isActif;
    private Boolean shareDatas;
    private String randomUsername;

    public Visiteur(String nom, String prenom, String dateNaissance, String mail, String mdp, String profession, Boolean isActif, Boolean shareDatas, String randomUsername){
        super(nom, prenom, dateNaissance, mail, mdp);
        this.profession = profession;
        this.isActif = isActif;
        this.shareDatas = shareDatas;
        this.randomUsername = randomUsername;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Boolean getActif() {
        return isActif;
    }

    public void setActif(Boolean actif) {
        isActif = actif;
    }

    public Boolean getShareDatas() {
        return shareDatas;
    }

    public void setShareDatas(Boolean shareDatas) {
        this.shareDatas = shareDatas;
    }

    public String getRandomUsername() {
        return randomUsername;
    }

    public void setRandomUsername(String randomUsername) {
        this.randomUsername = randomUsername;
    }
}
