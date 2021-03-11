package btssio.slam5.telethon.room.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import btssio.slam5.telethon.room.entities.Responsable;
import btssio.slam5.telethon.room.entities.Site;
import btssio.slam5.telethon.room.entities.Utilisateur;
import btssio.slam5.telethon.room.entities.Visiteur;
import btssio.slam5.telethon.room.relations.ResponsableAndSite;

@Dao
public interface ResponsableDao {

    @Insert
    void insert(Responsable responsable);

    @Update
    void updateUser(Responsable responsable);

    @Delete
    void delete(Responsable responsable);

    @Query("SELECT * FROM responsable")
    List<Responsable> getResponsable();

    @Transaction
    @Query("SELECT * FROM responsable")
    public List<ResponsableAndSite> getResponsableAndSite();



}
