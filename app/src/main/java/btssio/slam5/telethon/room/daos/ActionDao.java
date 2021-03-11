package btssio.slam5.telethon.room.daos;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

import btssio.slam5.telethon.room.entities.Action;

@Dao
public interface ActionDao {

    @Insert
    void insert(Action action);

    @Update
    void updateUser(Action action);

    @Delete
    void delete(Action action);

    @Query("SELECT * FROM `action`")
    List<Action> getActions();

}
