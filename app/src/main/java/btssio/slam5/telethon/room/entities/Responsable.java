package btssio.slam5.telethon.room.entities;

import androidx.room.Entity;

@Entity(tableName = "responsable")
public class Responsable extends Utilisateur{

    private Boolean isResponsable;

    public Responsable(String nom, String prenom, String dateNaissance, String mail, String mdp, Boolean isResponsable){
        super(nom, prenom, dateNaissance, mail, mdp);
        this.isResponsable = isResponsable;
    }

    public Boolean getResponsable() {
        return isResponsable;
    }

    public void setResponsable(Boolean responsable) {
        isResponsable = responsable;
    }
}
