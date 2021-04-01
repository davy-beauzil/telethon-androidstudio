package btssio.slam5.telethon.room.daos;

import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import btssio.slam5.telethon.room.entities.Utilisateur;

public interface UtilisateurDAO {

    @Insert
    void insert(Utilisateur utilisateur);

    @Update
    void update(Utilisateur utilisateur);

    @Delete
    void delete(Utilisateur utilisateur);

    @Delete
    void deleteAll(Utilisateur... utilisateur);

    @Query("SELECT * FROM utilisateur")
    List<Utilisateur> getUtilisateur();

}
