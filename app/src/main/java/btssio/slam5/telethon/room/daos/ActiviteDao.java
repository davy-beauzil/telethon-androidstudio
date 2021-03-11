package btssio.slam5.telethon.room.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import btssio.slam5.telethon.room.entities.Activite;

@Dao
public interface ActiviteDao {

    @Insert
    void insert(Activite activite);

    @Update
    void updateUser(Activite activite);

    @Delete
    void delete(Activite activite);

    @Query("SELECT * FROM activite")
    List<Activite> getActivite();

}
