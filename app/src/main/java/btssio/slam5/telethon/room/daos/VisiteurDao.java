package btssio.slam5.telethon.room.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Transaction;
import androidx.room.Update;

import java.util.List;

import btssio.slam5.telethon.room.entities.Visiteur;
import btssio.slam5.telethon.room.relations.VisiteurAndActivities;

@Dao
public interface VisiteurDao {

    @Insert
    void insert(Visiteur visiteur);

    @Update
    void updateUser(Visiteur visiteur);

    @Delete
    void delete(Visiteur visiteur);

    @Delete
    void deleteAll(Visiteur... visiteur);

    @Query("SELECT * FROM visiteur")
    List<Visiteur> getVisiteur();

    @Transaction
    @Query("SELECT * FROM visiteur")
    List<VisiteurAndActivities> getActiviteAndVisiteur();

}
