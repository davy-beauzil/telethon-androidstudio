package btssio.slam5.telethon.room.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import btssio.slam5.telethon.room.entities.Site;


@Dao
public interface SiteDao {

    @Insert
    void insert(Site site);

    @Update
    void updateUser(Site site);

    @Delete
    void delete(Site site);

    @Query("SELECT * FROM site")
    List<Site> getSite();

}
