package btssio.slam5.telethon.room.entities;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

@Entity(tableName = "activite")
public class Activite {

    @PrimaryKey
    private int id;
    private String nom;
    private int user_id;
    private int action_id;

    public Activite(int id, String nom, int user_id, int action_id) {
        this.id = id;
        this.nom = nom;
        this.user_id = user_id;
        this.action_id = action_id;
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

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getAction_id() {
        return action_id;
    }

    public void setAction_id(int action_id) {
        this.action_id = action_id;
    }
}
